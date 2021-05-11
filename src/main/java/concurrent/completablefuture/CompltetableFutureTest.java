package concurrent.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import lombok.SneakyThrows;

public class CompltetableFutureTest {
	
	public Future<String> calculateAsync() throws InterruptedException {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		
		Executors.newCachedThreadPool().submit(() -> {
			Thread.sleep(3000);
			completableFuture.complete("Hello");
			return null;
		});
		
		return completableFuture;
	}
	
	@SneakyThrows
	public Future<String> calculateChain() {
		CompletableFuture<String> f1 = CompletableFuture
			.supplyAsync(() -> "Hello");
		
		CompletableFuture<String> f2 = f1.thenApply( s -> s + ", World!");
		
		return f2;
	}
	
	public static void main(String[] args) {
		System.out.println("Prepared the pipeline");
		create().thenApplyAsync(data -> {
			System.out.println("Apply: " + Thread.currentThread());
			return data * 2;
		})
			.thenAccept(System.out::println);
		sleep(2000);
		System.out.println("finished");
	}
	
	private static CompletableFuture<Integer> create() {
		return CompletableFuture.supplyAsync(() -> {
			sleep(1000);
			System.out.println("Create:" + Thread.currentThread());
			return 2;
		});
	}
	
	private static void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
