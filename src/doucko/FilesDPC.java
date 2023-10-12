package doucko;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesDPC {
    public static void main(String[] args) {
        System.out.println(withoutVowels("fileio.txt"));
    }

    public static String readFile(String filePath) {
        Path path = Paths.get(filePath);
        List<String> lines;
        StringBuilder content = new StringBuilder();

        try {
            lines = Files.readAllLines(path);
            for (String line : lines) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }

    public static List<String> readLines(String fileName) {
        Path path = Path.of(fileName);
        try {
            List<String> line = Files.readAllLines(path);
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String withoutVowels(String fileName) {
        StringBuilder modifiedContent = new StringBuilder();

        for (String line : readLines(fileName)) {
            String lineWithoutVowels = line.replaceAll("[aeiouyAEIOUY]", "");
            modifiedContent.append(lineWithoutVowels).append("\n");
        }

        return modifiedContent.toString();
    }

}
