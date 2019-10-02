// Find a birthday in the first million digits of pi.
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class PiBirth {
    public enum Month
    {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
    public static void main(String[] args) throws FileNotFoundException {
        Scanner userIn = new Scanner(System.in);
        System.out.print("What\'s your birthday day in the month?  ");
        int day = Integer.parseInt(userIn.nextLine());
        System.out.print("What\'s your birth month?  ");
        String month = userIn.nextLine();
        month = month.toUpperCase();
        month = Integer.toString((Month.valueOf(month)).ordinal() + 1);
        System.out.print("What\'s your birth year?  ");
        String year = (userIn.nextLine()).substring(2);
        String birthdate = month + day + year;
        System.out.println(birthdate);

        File file = new File("pi-million.txt");
        Scanner fileIn = new Scanner(file);
        String pi = fileIn.nextLine();

        int start = pi.indexOf(birthdate);
        int end = start + birthdate.length();
        String left = pi.substring(start-10, start);
        String right = pi.substring(end, end+10);
        System.out.println("Found your birthday at PI digit " + start);
        System.out.println("..." + left + " * " + pi.substring(start, end) + " * " + right + "...");
    }
}
