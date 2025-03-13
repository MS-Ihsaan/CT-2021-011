package Q_05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double temFahrenheit = scanner.nextDouble();
        double temCelsius = (temFahrenheit - 32)/(9/5.0);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Temperature in Celsius: "+df.format(temCelsius));
    }
}
