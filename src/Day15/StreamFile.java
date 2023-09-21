package Day15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class StreamFile {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("C:\\Users\\mariappan.sivakumar\\Documents\\Java\\practice\\src\\sample.txt"))
                .map(str->str.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
    }
}
