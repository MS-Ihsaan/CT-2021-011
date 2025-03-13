package Q_06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of born: ");
        int birthYear = scanner.nextInt();

        GregorianCalendar cal = new GregorianCalendar();
        int currentYear = cal.get(Calendar.YEAR);
        int currentAge = currentYear - birthYear;
        System.out.println("You were born in "+birthYear+" and will be (are) "+currentAge+" this year.");
    }
}
