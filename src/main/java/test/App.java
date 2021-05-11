package test;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        System.out.println( UUID.randomUUID().toString().replace("-",""));
        System.out.println( UUID.randomUUID().toString().replace("-",""));
        System.out.println( UUID.randomUUID().toString().replace("-",""));
        System.out.println( UUID.randomUUID().toString().replace("-",""));


//        Stream<String> stringStream = Stream.of("1", "2", "-5");
//
//        final int sum = stringStream.mapToInt(Integer::parseInt)
//                .sum();
//        System.out.println(sum);
    }
    public static String change(String msg) {
        msg = msg + " world!";
        return " java!";
    }
    
    private static void b(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }
    }

}
