package practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class DateConversionAssignment1 {
    public static void main(String[] args) {
        // User input string representing date and time in IST
    	Scanner sc= new Scanner(System.in);
        //String userInput = "29/01/2024 01:00";
    System.out.println("enter the date in dd/mm/yyyy hh:mm format");
          String userInput = sc.nextLine();
        // Format for parsing and formatting dates
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("IST")); // Set time zone to IST

        try {
            // Parse user input string to Date object
            Date date = sdf.parse(userInput);

            // Convert to Local timestamp (IST) and Unix Timestamp
            convertToLocalTimestampAndUnixTimestamp(date);

            // Convert to Local timestamp (IST) and UTC
            convertToLocalTimestampAndUTC(date);

            // Convert to UTC and Local timestamp (IST)
            convertToUTCAndLocalTimestamp(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void convertToLocalTimestampAndUnixTimestamp(Date date) {
        // Convert to Local timestamp (IST)
        System.out.println("Local Timestamp (IST): " + date);

        // Convert to Unix timestamp
        long unixTimestamp = date.getTime();
        System.out.println("Unix Timestamp (milliseconds): " + unixTimestamp);
    }

    private static void convertToLocalTimestampAndUTC(Date date) {
        // Convert to Local timestamp (IST)
        System.out.println("Local Timestamp (IST): " + date);

        // Convert to UTC
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC")); // Set time zone to UTC
        String utcTimestamp = sdf.format(date);
        System.out.println("UTC Timestamp (UTC): " + utcTimestamp);
    }

    private static void convertToUTCAndLocalTimestamp(Date date) {
        // Convert to UTC
        SimpleDateFormat sdfUTC = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        sdfUTC.setTimeZone(TimeZone.getTimeZone("UTC")); // Set time zone to UTC
        String utcTimestamp = sdfUTC.format(date);
        System.out.println("UTC Timestamp (UTC): " + utcTimestamp);

        // Convert to Local timestamp (IST)
        SimpleDateFormat sdfIST = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        sdfIST.setTimeZone(TimeZone.getTimeZone("IST")); // Set time zone to IST
        try {
            Date localDate = sdfIST.parse(utcTimestamp);
            System.out.println("Local Timestamp (IST): " + localDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
