package Q_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double temCelsius = scanner.nextDouble();
        double temFahrenheit = (1.8 * temCelsius) + 32;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Temperature in Fahrenheit: "+df.format(temFahrenheit));
    }
}
