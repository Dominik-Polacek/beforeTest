package filesandhashmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class SalesStatistics {
    public static void main(String[] args) {
        String filename = "productinfo.txt";
        System.out.println(calculateSalesStats(filename));
    }

    public static HashMap<String, Integer> calculateSalesStats(String filePath) {
        int totalUnits = 0;
        int totalRevenue = 0;
        HashMap<String, Integer> data = new HashMap<>();

        //čteme soubor
        List<String> output;
        try {
            output = Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException("File not found:" + filePath);
        }
        //projdeme řádky v listu a rozdělím vstupní řetězec (line.split) na ,
        for (String line : output) {
            String[] parts = line.split(",");
            if (parts.length != 3) {    //když "parts = počet požadavků se nebude = 3 (protože 3 požadavky)
                throw new IllegalArgumentException("Invalid data format in the file.");
            }

            //ze zadání si udělám proměnnou product, kterej uložím do nultýho pole parts (vstupního řetězce zde)
            String product = parts[0];
            int unitSold = Integer.parseInt(parts[1]); //převedeme na int a uložíme do 1. pozice
            int revenue = Integer.parseInt(parts[2]);   //uložíme do 2 pozice
            totalUnits += unitSold;
            totalRevenue += revenue;

            data.put("Total revenue:", totalRevenue); //výsledek dám do hashmapy
            data.put("Total Units:", totalUnits);

        }
        return data;
    }
}
