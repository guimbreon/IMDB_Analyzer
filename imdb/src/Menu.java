import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        List<String[]> csvData = Reading.readFile("/home/guimbreon/Desktop/git/IMDB/dataExample/ratings.csv");
        Scanner scanner = new Scanner(System.in);
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("What's the file source you want to analyze?\n");
        List<String[]> csvData = Reading.readFile(scanner.nextLine());
*/
        /*Initializing the functions*/
        Calculator calculator = new Calculator();
        SearchYear searchYear = new SearchYear();

        String myYear; //Used when you are searching for specific years.

        int out = 1;
        while(out == 1){
            try{
                System.out.println("""
                        What do you want to do?
                        1. View your mean Rating Value!
                        2. What's the year with most movies watched?
                        3. What's the mean Year of the watched movies?
                        4. How many movies from a specific movie have I rated?
                        5. What are the movies from a specific year I rated?
                        """);
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> {
                        calculator.calculateMean(csvData);
                        System.out.println("Mean Rate: " + calculator.getMean());
                        System.out.println();
                        out = 2;
                    }
                    case 2 -> {
                        searchYear.modeYear(csvData);
                        System.out.println("Mode Year: " + searchYear.getTheYear());
                        System.out.println();
                        out = 2;
                    }
                    case 3 -> {
                        searchYear.meanYear(csvData);
                        System.out.println("Mean Year: " + searchYear.getTheYear());
                        System.out.println();
                        out = 2;
                    }
                    case 4 -> {
                        System.out.println("Enter the year you want to search: ");
                        myYear = scanner.nextLine();
                        System.out.println();
                        searchYear.manyYear(csvData, myYear);
                        out = 2;
                    }
                    case 5 -> {
                        System.out.println("Enter the year you want to search: ");
                        myYear = scanner.nextLine();
                        System.out.println("\nThe Movies that were made that year are:\n");
                        searchYear.filmYear(csvData, myYear);
                        out = 2;
                    }
                    default -> {
                        System.out.println("The number you inserted, is not a valid answer!");
                        out = 1;
                    }
                }
            }catch (NumberFormatException e){
                out = 1;
                System.out.println("Error: Invalid Input. Please enter a valid integer!\n\n\n");
            }

        }
    }

}
