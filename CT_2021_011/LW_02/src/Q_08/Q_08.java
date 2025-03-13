package Q_08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Volume of the sphere is: "+df.format(volume));
    }
}
