package practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateConversionAssignment2 {
    public static void main(String[] args) {
        // User input string representing date and time
        //String userInput = "2024-01-29 01:00";
    	Scanner sc= new Scanner(System.in);
    	System.out.println("enter the date in yyyy-mm-dd hh:mm format");
        String userInput = sc.nextLine();
        try {
            // Parse user input string to Date object
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date = sdf.parse(userInput);

            // Add one day
            System.out.println("Add one day");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            Date oneDayAdded = calendar.getTime();
            System.out.println("After adding one day: " + sdf.format(oneDayAdded));

            // Subtract 10 days
            System.out.println("Subtract 10 days");
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, -10);
            Date tenDaysSubtracted = calendar.getTime();
            System.out.println("After subtracting 10 days: " + sdf.format(tenDaysSubtracted));

            // Add 1 hour
            System.out.println("Add 1 hour");
            calendar.setTime(date);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            Date oneHourAdded = calendar.getTime();
            System.out.println("After adding one hour: " + sdf.format(oneHourAdded));

            // Subtract 5 hours and 30 minutes
            System.out.println("Subtract 5 hours and 30 minutes");
            calendar.setTime(date);
            calendar.add(Calendar.HOUR_OF_DAY, -5);
            calendar.add(Calendar.MINUTE, -30);
            Date fiveHoursThirtyMinsSubtracted = calendar.getTime();
            System.out.println("After subtracting 5 hours and 30 minutes: " + sdf.format(fiveHoursThirtyMinsSubtracted));

            // Sorting objects using Date
            System.out.println("Sorting objects using Date");
            Date[] dates = {date, oneDayAdded, tenDaysSubtracted, oneHourAdded, fiveHoursThirtyMinsSubtracted};
            System.out.println("\nSorted dates:");
            SimpleDateFormat sdfForSorting = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            for (Date d : dates) {
                System.out.println(sdfForSorting.format(d));
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
