package concurrent.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompltetableFutureTestTest {
	
	private final CompltetableFutureTest futureService = new CompltetableFutureTest();
	
	@Test
	@SneakyThrows
	void calculateAsync() {
		System.out.println("From Test");
		Future<String> stringFuture = futureService.calculateAsync();
		System.out.println("Now Start wainting");
		final String result = stringFuture.get();
		System.out.println("GOT IT");
		
		assertEquals("Hello", result);
	}
	
	
	@Test
	@SneakyThrows
	public void asynchTest() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Hello";
		});
		System.out.println("WATING");
		
		assertEquals("Hello", future.get());
	}
	
	@Test
	@SneakyThrows
	public void futureTestChain() {
		final String futureResult = futureService.calculateChain().get();
		
		assertEquals("Hello, World!", futureResult);
	}
}