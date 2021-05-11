package functional.stream.answers;

import classes.User;
import classes.UserSex;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StreamApiAnswers {
	
	
	/**
	 * Найти сумму чисел
	 */
	@Test
	public void sumTest() {
		Stream<String> stringStream = Stream.of("1", "-2", "10");
		
		final int sum = stringStream
			.mapToInt(Integer::parseInt)
			.sum();
		
		Assertions.assertEquals(9, sum);
	}
	
	/**
	 * Найти имя самую молодую девушку
	 */
	@Test
	public void sortUserTest() {
		String name = "Милана";
		
		Stream<User> userStream = getUserStream();
		
		final String resultName = userStream
			.filter(user -> user.getSex().equals(UserSex.FEMALE))
			.min(Comparator.comparingInt(User::getAge))
			.map(User::getName).orElse("Нет таких");
		
		Assertions.assertEquals(name, resultName);
	}
	
	/**
	 * Создание Мап из списка, группировка
	 */
	@Test
	public void mapGroup() {
        final Stream<User> users = getUserStream();
        
        final Map<UserSex, List<User>> usersBySex = users
            .collect(Collectors.groupingBy(User::getSex));
        
        usersBySex.forEach((k,v) -> {System.out.println("Key: " + k + " values:");
            v.forEach(System.out::println);
        });
        
        Assertions.assertEquals(2, usersBySex.size());
        Assertions.assertTrue(usersBySex.containsKey(UserSex.FEMALE));
        Assertions.assertTrue(usersBySex.containsKey(UserSex.MALE));
	}
	
	/**
	 * Найти самого молого опльзователя срези друзей
	 */
	@Test
	public void listTest() {
		final Stream<User> usersWithFriends = getUsersWithFriends();
		
		final String no_one = usersWithFriends
			.flatMap(user -> user.getFriends().stream())
			.peek(System.out::println)
			.filter(user -> UserSex.MALE.equals(user.getSex()))
			.min(Comparator.comparingInt(User::getAge))
			.map(User::getName)
			.orElse("No one");
		
		Assertions.assertEquals("Яща", no_one);
		
	}
    
    /**
     * Работа с мапой. Развернуть список в мапе
     */
    @Test
    public void mapUngroup() {
        final Map<UserSex, List<User>> usersBySex = getUsersBySex();
//        usersBySex.values();
//        usersBySex.keySet();
        final List<User> users = usersBySex.entrySet().stream()
            .flatMap(entry -> entry.getValue().stream())
            .collect(Collectors.toList());
        
        Assertions.assertEquals(getUserStream().count(), users.size());
    }
    
    @Test
    public void parrallelStreamCores() {
	    System.out.println(Runtime.getRuntime().availableProcessors());
	    System.out.println(ForkJoinPool.commonPool());
    }
    
    
    
    private Map<UserSex, List<User>> getUsersBySex() {
       return getUserStream().collect(Collectors.groupingBy(User::getSex));
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
