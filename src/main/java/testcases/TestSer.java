package testcases;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestSer {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> future = new FutureTask<>( () -> {
            int result = 0;
            for (int i = 0; i < 5; i++) {
                result++;
                Thread.sleep(1000);
            };
            return result;
        });

        Thread thread = new Thread(future);
        thread.start();
        System.out.println(future.get());
        System.out.println("Hello from main");
    }
}
