package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Date_Time {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the date (dd-MM-yyyy): ");
        String inputDate = scaner.nextLine();

        // parsing input date using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd-MM-yyyy"));
        LocalDate date = LocalDate.parse(inputDate,formatter);

        // find the day of week
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);

        // calculate the diffrence between input date and current date
        LocalDate currentDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(date, currentDate);
        System.out.println("Days between input date and curent date: " + daysBetween);

        //display the current Date and time ina  formatte way
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        System.out.println("Current date and time: "+currentDateTime.format(dateTimeFormatter));
    }
}
