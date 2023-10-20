import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reading {
    public static List<String[]> readFile(String file) {
        List<String[]> csvData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    // Trim each field to remove leading and trailing whitespace
                    row[i] = row[i].trim();

                    // Check if the field is empty or consists only of whitespace
                    if (row[i].isEmpty()) {
                        row[i] = "NULL"; // Replace with "NULL" or any other representation
                    }
                }
                csvData.add(row);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
        // Now you have the CSV data stored in the List<String[]> csvData
        return csvData;
    }
}
