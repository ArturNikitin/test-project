package test.stream;

import classes.UserSex;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        final List<User> users = Arrays.asList(new User("Jack", 15, UserSex.MALE), new User("Anton", 15, UserSex.MALE));
        final List<User> users1 = Arrays.asList(new User("Ira", 15, UserSex.MALE), new User("Lena", 15, UserSex.MALE));

//        final List<Object> collect = Stream.of(users, users1)
//                .flatMap(x -> x.stream().map(User::getName))
//                .collect(Collectors.toList());

        final List<Object> collect = Stream.of(users, users1)
                .flatMap(x -> x.stream().map(User::getName))
                .collect(Collectors.toList());


//        collect.forEach(System.out::println);


        System.out.println(calculate(List.of(1,2,10,15), integer -> integer % 2 == 0));
        System.out.println(calculate(List.of(1,2,10,15), integer -> true));
    }


    public static int calculate(List<Integer> list, Predicate<Integer> filter) {
//        int result = 0;
//
//        for (Integer i : list) {
//            result += i;
//        }
//
//        return result;

        return list
                .stream()
                .filter(filter)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int calculateEven(List<Integer> list) {
        int result = 0;

        for (Integer i : list) {
            if (i % 2 == 0)
                result += i;
        }

        return result;
    }
}
