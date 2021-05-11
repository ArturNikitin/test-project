package functional.stream;

import classes.User;
import classes.UserSex;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


/**
 * Тестовые задачки для стримов
 */
public class StreamApi {


    /**
     * Найти сумму чисел
     */
    @Test
    public void sumTest() {
        Stream<String> stringStream = Stream.of("1", "-2", "10");
        
        stringStream.mapToInt(Integer::parseInt).sum();

//        Assertions.assertEquals(Integer.valueOf(9), integer);
    }

    /**
     * Найти имя самую молодую девушку
     */
    @Test
    public void sortUserTest() {
        String name = "Милана";

        Stream<User> userStream = getUserStream();
    
        final String no_one = userStream
            .filter(x -> UserSex.FEMALE.equals(x.getSex()))
            .min(Comparator.comparingInt(User::getAge)).map(User::getName).orElse("no one");

        Assertions.assertEquals(name, no_one);
    }
    
    /**
     * Найти самого молого опльзователя срези друзей
     */
    @Test
    public void listTest() {
        final Stream<User> usersWithFriends = getUsersWithFriends();
        
    
//        Assertions.assertEquals("Яща", no_one);
        
    }

    private Stream<User> getUserStream() {
        final User first = new User("Яща", 15, UserSex.MALE);
        final User second = new User("Маша", 22, UserSex.FEMALE);
        final User third = new User("Альберт", 54, UserSex.MALE);
        final User F = new User("Милана", 2, UserSex.FEMALE);
        final User Fi = new User("Татьяна", 73, UserSex.FEMALE);
        final User S = new User("Айгул", 37, UserSex.MALE);
        final User Se = new User("Роман", 48, UserSex.MALE);
        return Stream.of(first, second, third, F, Fi, S, Se);
    }
    
    private Stream<User> getUsersWithFriends() {
    
        return Stream.of(new User("Иван", 8, UserSex.MALE, getUserStream().collect(Collectors.toList())),
            new User("Катя", 23, UserSex.FEMALE, List.of(new User("Даша", 44, UserSex.FEMALE))));
    
    }
    
}
