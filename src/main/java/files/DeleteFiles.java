package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import lombok.SneakyThrows;

public class DeleteFiles {
	
	public static final String FILE_WITH_ID = "Q:\\work\\ids.txt";
	public static final String CORPUS_DIRECTORY = "Q:\\work\\corpus_all_fixed";
	
	@SneakyThrows
	public static void main(String[] args) {
		
		Path path = Paths.get(FILE_WITH_ID);
		
		final List<String> ids = Files.readAllLines(path);
		
		System.out.println(ids.size());
		
		Path directory = Paths.get(CORPUS_DIRECTORY);
		
		removeFiles(directory, ids);
		
	}
	
	public static void removeFiles(Path directory, List<String> ids) throws IOException {
		
		try(Stream<Path> stream = Files.list(directory)) {
			stream.forEach(path -> {
				System.out.println(path.getFileName().toFile().toString().replaceAll(" ", "_"));
				System.out.println("Deleted " + path.getFileName().toString());
					
				});
		}
	}
}
