package Q_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in centimeters: ");
        double cm = scanner.nextDouble();

        double totalInches = cm / 2.54;
        int feets = (int)(totalInches / 12);
        double inches = totalInches % 12;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(cm+" cm is equal to "+feets+" feets and "+df.format(inches)+" inches");
    }
}
