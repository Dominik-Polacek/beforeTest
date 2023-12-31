package doucko;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        String filename = "fileio.txt"; //cteni souboru
        System.out.println(readFile(filename));

        List<String> fileContent = readFile(filename); //zapisovani souboru
        writeFile("fileio.txt", fileContent);
    }

    //vem soubor a načti ho
    public static List<String> readFile(String filePath) {
        List<String> output;
        try {
            output = Files.readAllLines(Path.of(filePath));  //do listu přidej cestu
        } catch (IOException e) {
            throw new RuntimeException("File doesn't exist.");
        }
        return output;
    }

    public static void writeFile(String filename, List<String> content) {
        try {
            Files.write(Paths.get(filename), content); //StandardOpenOption.Append (přidání do souboru)
        } catch (IOException e) {
            throw new RuntimeException("Couldn't write to file " + filename);
        }
    }
}
