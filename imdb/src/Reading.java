import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reading {
    public static List<String[]> readFile(String file) {
        List<String[]> csvData = new ArrayList<>();
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if (i != 0) {
                    csvData.add(row);
                }
                i = 12;
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
        // Now you have the CSV data stored in the List<String[]> csvData
        return csvData;
    }
}
