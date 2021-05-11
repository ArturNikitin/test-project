package testcases;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> biFunction = (a, b) -> {
            StringBuilder sb = new StringBuilder(a);
            for (int i = 0; i < b; i++) {
                sb.append(" friend");
            }
            return sb.toString();
        };
        Function<String, String> function = x -> {
            x += " from function";
            System.out.println(x);
            return x;
        };
        Consumer<String> consumer = System.out::println;
        biFunction.andThen(function).apply("Hello", 2);

        System.out.println(BinaryOperator.minBy(Integer::compareTo).apply(10,12));


        Predicate<Integer> predicate = x -> x < 10;
        System.out.println(predicate.test(15));
        System.out.println(predicate.negate().test(15));
        System.out.println(predicate.or(x -> x == 15).test(15));
        System.out.println(predicate.and(x -> x == 15).test(15));

        List<String> list = List.of("a", "b", "c");
        List<String> a = list.stream().filter(x -> x.equals("a"))
                .collect(Collectors.toList());
        a.forEach(System.out::println);

        List<String> list2 = Arrays.asList("a", "b", "c");
        list2.stream()
                .map(x -> x+=x)
                .forEach(System.out::println);
    }

    public static void doSomething(String s, Integer integer) {
        for (int i = 0; i < integer; i++) {
            System.out.println(s);
        }
    }

}
