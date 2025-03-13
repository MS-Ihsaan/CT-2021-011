package Q_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MONTHS_IN_YEAR = 12;

        System.out.println("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the loan period in years: ");
        double loanPeriod = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;
        double  numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(
                1 /(1 + monthlyInterestRate), numberOfPayments) );
        double totalPayment = monthlyPayment * numberOfPayments;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Monthly payment amount: "+df.format(monthlyPayment));
        System.out.println("Total payment amount: "+df.format(totalPayment));
    }
}
