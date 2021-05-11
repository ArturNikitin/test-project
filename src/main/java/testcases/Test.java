package testcases;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Testing
public class Test {
    public static void main(String[] args) throws Exception {
        List<User> users = Stream.of(
                new User("Anton", 1994, new Car("Audi")),
                new User("Inga", 2002, new Car("Audi")),
                new User("Vlada", 1954, new Car("BMW")),
                new User("Masha", 1975, new Car("Volvo")),
                new User("Petya", 1998, new Car("BMW")),
                new User("Gretta", 1991, new Car("Audi"))).collect(Collectors.toList());

        /*users.stream()
                .collect(Collectors.groupingBy(User::getCar))
                .forEach((k,v) -> {
                    System.out.println(k.getName() + ":");
                    v.stream().filter(u -> u.getBirthYear() > 1990)
                            .forEach(e -> System.out.println(e.getName() + " " + e.getBirthYear()));
                });*/

        /*users.stream()
                .map(User::getCar)
                .forEach(x -> System.out.println(x.getName()));*/

        Optional<Object> empty = Optional.empty();
        empty.ifPresent(val -> System.out.println(val));
    }

    public static int reverse(int i) {
        int result = 0;
        int previous = 0;
        while (i != 0) {
            int cur = i % 10;
            i /= 10;

            result = result * 10 + cur;

            if ((result - cur) / 10 != previous) return 0;

            previous = result;
        }

        return result;
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (sum + nums[j] == target && j != i) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }


    public Test() {

    }

    public void testMethod() throws Exception {
        System.out.println("Hello 1");
    }

    static class MyProxy implements InvocationHandler {
        private TestInterface testInterface;

        public MyProxy(TestInterface testInterface) {
            this.testInterface = testInterface;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Hi from Proxy");
            return method.invoke(testInterface, args);
        }
    }

}
