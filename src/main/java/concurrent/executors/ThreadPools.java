package concurrent.executors;

import java.io.BufferedOutputStream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import lombok.SneakyThrows;

public class ThreadPools {
	
	@SneakyThrows
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Runnable runnableTask = () -> {
			try {
				TimeUnit.MILLISECONDS.sleep(300);
				System.out.println("FROM RUNNABLE");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Callable<String> callableTask  = () -> {
			TimeUnit.MILLISECONDS.sleep(300);
			return "From Callable";
		};
		
		final List<Callable<String>> callableTasks = List.of(callableTask, callableTask, callableTask);
		
		executorService.execute(runnableTask); // Execute не возвразает результат
		
		final Future<String> callableResult = executorService.submit(callableTask);// Возвращает значение
		System.out.println("FROM MAIN");
		
		
		final String s2 = callableResult.get();
		System.out.println(s2 + " From Main");
		
		
		final List<Future<String>> futures = executorService.invokeAll(callableTasks);// Вызвает все - возвращает лист
		final String s = executorService.invokeAny(callableTasks);// Возвращает результат первой выполненной
		
		
		/**
		 * Initiates an orderly shutdown in which previously submitted
		 * tasks are executed, but no new tasks will be accepted.
		 * Invocation has no additional effect if already shut down.
		 *
		 * <p>This method does not wait for previously submitted tasks to
		 * complete execution.  Use {@link #awaitTermination awaitTermination}
		 * to do that.
		 */
		executorService.shutdown();
		
		/**
		 * Blocks until all tasks have completed execution after a shutdown
		 * request, or the timeout occurs, or the current thread is
		 * interrupted, whichever happens first.
		 */
		executorService.awaitTermination(1000L, TimeUnit.MILLISECONDS);
		
		/**
		 * Будет пытаться сами таски выключить путем вызова метод Interrupt, если
		 * не будет реагировать, то продолжит их выполненеи, чем не будет отличаться
		 * от #shutDown(). Возвращает набор тасок из очереди.
		 */
		final List<Runnable> runnables = executorService.shutdownNow();
		
		System.out.println(s + "FROM ANY");
		for (Future<String> result:
		     futures) {
			final String s1 = result.get();
			System.out.println(s1 + "FROM ALL");
		}
	}
}
