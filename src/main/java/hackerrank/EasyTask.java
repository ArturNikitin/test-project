package hackerrank;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EasyTask {
    public static void main(String[] args) {
       Printer printer = new Printer();
       String[] strings = new String[]{"Hello", "World"};
       Integer[] ints = {1,23,4,5};
       printer.printArray(strings);
       printer.printArray(ints);
    }
    
    public static void findUniquePairs(String[] pair_left, String[] pair_right) {
        Set<String> set = new HashSet<>(pair_left.length);
        for (int i = 0; i < pair_left.length; i++) {
            set.add(pair_left[i] + " " +pair_right[i]);
            System.out.println(set.size());
        }
        ExecutorService ex = Executors.newFixedThreadPool(10);
    }
}
class Printer {
    public <T> void printArray(T[] t){
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
}