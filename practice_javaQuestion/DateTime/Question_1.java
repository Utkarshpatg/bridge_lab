package DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-yyyy HH:MM:SS z");

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Local Time: " + now.format(formatter));

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("GMT Time: " + gmtTime.format(formatter));

        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(String.format("Ist time: " + istTime.format(formatter)));

        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("PST Time: " + pstTime.format(formatter));

    }
}
