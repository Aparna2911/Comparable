package practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Conversion {
    public static void main(String[] args) {
        // Fetching current date
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        // Formatting a Date to String
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatteddate = dateformat.format(currentDate);
        System.out.println("Formatted Date: " + formatteddate);

        // Parsing a String to Date
        String dateString = "2024-01-30 15:30:00";

        // Exception handling
        try {
            Date parseddate = dateformat.parse(dateString);
            System.out.println("Parsed Date: " + parseddate);
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
    }
}

