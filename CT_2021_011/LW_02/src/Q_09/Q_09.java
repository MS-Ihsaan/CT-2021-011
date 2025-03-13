package Q_09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter invest amount in dollars: ");
        double invest = scanner.nextDouble();

        System.out.println("Enter interest rate compounded annually: ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        double years = scanner.nextDouble();

        double amountEarned =  invest * Math.pow((1 + (interestRate / 100)),years);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The amount of money earned after "+(int)(years)+" years: "+df.format(amountEarned)+" $");
    }
}
