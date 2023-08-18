import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<String[]> csvData = Reading.readFile("/home/guimbreon/Desktop/git/IMBD/ratings.csv");
        SearchYear search = new SearchYear();
        search.manyYear(csvData,"2022");

    }


    }

