package beesandhoney;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bees2 {
    private static int hive = 0;
    private static int hiveMax = 30;
    private static int beesInHive = 10;
    private static int beesInHiveCapacity = 10;
    private static CountDownLatch latch = new CountDownLatch(1);
    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static Semaphore semaphore = new Semaphore(9);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(11);
        for (int i = 0; i < 10; i++) {
            service.submit(new Bee());
        }
        service.submit(new Bear());


        Thread.sleep(10_000);
        service.shutdownNow();
        System.out.println("0");
    }

    public static class Bee implements Runnable {
        @Override
        public void run() {
            try{
                while (hive < hiveMax) {
                    lock.lock();
                    if (beesInHive > 1) {
                        beesInHive--;
                        System.out.println(Thread.currentThread().getName() + " bee left for honey. " + "There are " + beesInHive + " bees in the hive");
                    } else {
                        condition.await();
                    }
                    lock.unlock();
                    Thread.sleep((int) (Math.random()*500));
                    lock.lock();
                    if (hive >= hiveMax) {
                        System.out.println(Thread.currentThread().getName() + " too much honey = " + hive);
                        condition.await();
                    } else {
                        hive++;
                        System.out.println(Thread.currentThread().getName() + " bee brought honey and now it is = " + hive);
                        if (hive >= hiveMax/2) {
                            condition.signal();
                        }
                        beesInHive++;
                    }
                    lock.unlock();
                    Thread.sleep((int) (Math.random()*200));
                }
            } catch (InterruptedException e) {

            } finally {
                lock.unlock();
            }
        }
    }

    public static class Bear implements Runnable {
        @Override
        public void run() {
            try {
                while(true) {
                    lock.lock();
                    if (hive < hiveMax/2) {
                        condition.await();
                    }
                    if (hive == hiveMax) {
                        break;
                    }
                    if (beesInHive < beesInHiveCapacity/3){
                        System.out.println("Bear ate it all!!!");
                        hive = 0;
                        condition.signalAll();
                    } else {
                        System.out.println("TOO MANY BEEEEEES");
                    }
                    lock.unlock();
                    Thread.sleep((int) (Math.random()*500));
                }
            } catch (InterruptedException e) {

            } finally {
                lock.unlock();
            }
        }
    }

}
