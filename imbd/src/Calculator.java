import java.util.List;
import java.lang.Math;

public class Calculator {

    private double mean;

    public double getMean() {
        return mean;
    }
    public void calculateMean(List<String[]> csvData) {
        int i = 0;
        double sum = 0;

        for (String[] row : csvData) {
            if (i != 0) {
                sum += Double.parseDouble(row[1]);
            } else {
                i = 13;
            }
        }

        mean = sum / (csvData.size() - 1);
        mean = Math.round(mean * 100.0) / 100.0;
    }


}
