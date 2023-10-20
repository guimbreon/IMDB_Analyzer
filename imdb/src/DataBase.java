import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class DataBase {
    public void check(List<String[]> csvData){
        String dbUrl = "jdbc:mysql://localhost:3306/Testing";
        String dbUser = "tester";
        String dbPassword = "StrongerPassword123!";

        // CSV file path and table name
        String tableName = "movies";

        //Scanner
        Scanner scanner = new Scanner(System.in);

        // Establish the database connection
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            System.out.println("Connected to the database");

            //To use any statement
            Statement statement = conn.createStatement();


            statement.executeUpdate("CREATE TABLE IF NOT EXISTS movies(" +
                    "id VARCHAR(25) PRIMARY KEY," +
                    "`Your Rating` VARCHAR(6)," +
                    "`Date Rated` DATE," +
                    "Title VARCHAR(200)," +
                    "URL VARCHAR(50)," +
                    "Type VARCHAR(100),"+
                    "`IMDb Rating` VARCHAR(190)," +
                    "`Runtime (mins)` VARCHAR(155)," +
                    "Year VARCHAR(126)," +
                    "Genres VARCHAR(250)," +
                    "`Num Votes` VARCHAR(103)," +
                    "`Release Date` VARCHAR(100)," +
                    "Directors VARCHAR(150));");
            Integer runs = 0;

            for(String[] row : csvData){

                if (runs == 0){
                    runs = 1;
                }else {
                    System.out.println(row[0] + " " + row[1] + " " + row[2] + " " + row[3] + " " + row[4] + " " + row[5] + " " + row[6] + " " + row[7] + " " + row[8] + " " + row[9] + " " + row[10] + " " + row[11] + " " + row[12] + " " + row[13]);

                    String SqlCommand = String.format("INSERT INTO movies VALUES " +
                                    "('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s','%s','%s');",
                            row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12]);
                    statement.executeUpdate(SqlCommand);
                }
            }



        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }

    }

}
