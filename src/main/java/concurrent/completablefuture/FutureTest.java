package concurrent.completablefuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import lombok.SneakyThrows;

public class FutureTest {
	@SneakyThrows
	public static void main(String[] args) {
		ExecutorService execotors = Executors.newSingleThreadExecutor();
		
		Future<Integer> result = execotors.submit(() -> {
			Thread.sleep(5000);
			return 1000 * 1000;
		});
		
		final Integer integer = result.get();
		
		System.out.println(integer);
	}
}
