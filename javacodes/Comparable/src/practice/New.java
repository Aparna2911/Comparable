package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class New {
	public static void main(String[] args)
	{
		System.out.println("enter the date");
		Scanner s=new Scanner(System.in);
		String inp=s.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(inp, formatter);
        LocalDateTime nextDay = dateTime.plusDays(1);
        System.out.println("Current LocalDateTime: " + dateTime.format(formatter));
        System.out.println("LocalDateTime after adding one day: " + nextDay.format(formatter));
        LocalDateTime previousDate = dateTime.minusDays(10);
        System.out.println("LocalDateTime after subtracting 10 days "+previousDate.format(formatter));
        LocalDateTime nextHour = dateTime.plusHours(1);
        System.out.println("LocalDateTime after subtracting 1 hour "+nextHour.format(formatter));
        LocalDateTime c = dateTime.minusHours(1).minusMinutes(30);
        System.out.println("LocalDateTime after subtracting 1 hour 30 minutes "+c.format(formatter));
        
	}
	}