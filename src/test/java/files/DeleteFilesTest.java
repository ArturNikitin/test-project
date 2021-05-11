package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;


class DeleteFilesTest {
	public static final String CORPUS_DIRECTORY = "Q:\\work\\test";
	
	
	@Test
	@SneakyThrows
	public void deletFilesTest() {
		Path dir = Path.of(CORPUS_DIRECTORY);
		
		try(final Stream<Path> list = Files.list(dir)) {
			list
				.forEach(path ->
				{
					System.out.println(path.getName(0));
					System.out.println(path.getFileName().toFile().getName());
					try {
						Files.deleteIfExists(path);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			);
			
		}
		
	}
	
}