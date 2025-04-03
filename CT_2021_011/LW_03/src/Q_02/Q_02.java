package Q_02;

import Q_01.Temperature;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = scanner.nextDouble();

        Temperature temp = new Temperature();
        temp.setFahrenheit(inputFahrenheit);
        System.out.println("Temperature in Celsius: " + temp.toCelsius());

        scanner.close();
    }
}
