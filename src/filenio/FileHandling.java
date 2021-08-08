package filenio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		String path = "D:\\hello2.txt";
		List<String> data = Arrays.asList("Line-01", "Line-02");
		// Files.write(Paths.get(path), data, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
		List<String> line = Files.readAllLines(Paths.get(path));
		for (String i : line) {
			System.out.println(i);
		}
		Files.delete(Paths.get(path));
		System.out.println("File created successfully");

	}

}
