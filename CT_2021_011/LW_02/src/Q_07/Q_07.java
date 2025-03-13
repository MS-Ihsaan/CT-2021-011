package Q_07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in Kg: ");
        int weight = scanner.nextInt();
        System.out.println("Enter your height in cm: ");
        int height = scanner.nextInt();

        double BMI = weight / Math.pow((height /100.0),2);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("BMI: "+df.format(BMI));
    }
}
