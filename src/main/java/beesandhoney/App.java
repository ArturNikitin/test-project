package beesandhoney;

import org.w3c.dom.css.Counter;

import java.util.Date;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
    public static int count;
    public static int countMax = 50;
    private static Lock lock = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static Condition condition2 = lock.newCondition();
    private static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(11);
        for (int i = 0; i < 10; i++) {
            service.submit(new Bee());
        }
        service.submit(new Bear());
        latch.countDown();

        Thread.sleep(10);
        service.shutdownNow();
        System.out.println(count);
    }

    public static class Bee implements Runnable{
        @Override
        public void run() {
            try {
                latch.await();
                while(true) {
                    lock.lock();
                    if (count >= countMax) {
                        System.out.println("WEEEEL? " + Thread.currentThread().getName());
                        condition.signal();
                        condition2.await();
                        System.out.println("woken up " + Thread.currentThread().getName());

                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + " got 1 and now it's " + count);

                    lock.unlock();
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class Bear implements Runnable{
        @Override
        public void run() {
            try{
                latch.await();
                while(true) {
                    lock.lock();
                    condition.await();
                    count = 0;
                    System.out.println("Bear ate it all!!!");
                    condition2.signalAll();
                    lock.unlock();
                }
            }catch (InterruptedException e) {

            }finally {

            }
        }
    }
}
