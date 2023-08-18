
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class SearchYear {
    private int theYear;

    public int getTheYear() {
        return theYear;
    }


    public void meanYear(List<String[]> csvData){
        int i = 0;
        double sum = 0;

        for (String[] row : csvData) {
            if (i != 0) {
                sum += Double.parseDouble(row[8]);
            } else {
                i = 13;
            }
        }
        sum = sum / (csvData.size() - 1);
        theYear = (int) sum;
    }


    public void modeYear(List<String[]> csvData) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (String[] row : csvData) {
            try {
                int year = Integer.parseInt(row[8]);
                frequencyMap.put(year, frequencyMap.getOrDefault(year, 0) + 1);
            } catch (NumberFormatException e) {
                // Handle parsing error if necessary
                System.out.println("Something in your data isn't in the right format.");
            }
        }

        int maxFrequency = 0;
        int modeYear = 0; // Initialize modeYear to a default value

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                modeYear = entry.getKey();
                maxFrequency = frequency;
            }
        }

        theYear = modeYear;
    }

    public void manyYear(List<String[]> csvData, String myYear){
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (String[] row : csvData) {
            try {
                int year = Integer.parseInt(row[8]);
                frequencyMap.put(year, frequencyMap.getOrDefault(year, 0) + 1);
            } catch (NumberFormatException e) {
                // Handle parsing error if necessary
                System.out.println("Something in your data isn't in the right format.");
            }
        }
        int amount = 0;
        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            if(entry.getKey() == Integer.parseInt(myYear)){
                amount = entry.getValue();
            }
        }
        if(amount != 0){
            System.out.println("You rated " + amount + " Movies from the year: " + myYear);
        }else{
            System.out.println("There isn't any record of that year in your ratings!");
        }
    }

    public void filmYear(List<String[]> csvData, String myYear){
        for (String[] row : csvData){
            if(Objects.equals(row[8], myYear)){
                System.out.println(row[3]);
            }
        }
    }

}
