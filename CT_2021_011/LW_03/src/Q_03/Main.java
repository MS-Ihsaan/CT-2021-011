package Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double innerCircleRadius;
        double outerCircleRadius;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the inner circle radius: ");
        innerCircleRadius = scanner.nextDouble();

        System.out.println("Enter the outer circle radius: ");
        outerCircleRadius = scanner.nextDouble();

        Circle innerCircle = new Circle(innerCircleRadius);
        Circle outerCircle = new Circle(outerCircleRadius);

        double innerCircleArea = innerCircle.computeArea();
        double outerCircleArea = outerCircle.computeArea();
        double shadedArea = outerCircleArea - innerCircleArea;
        System.out.println("The Area of shaded area: "+shadedArea);
    }
}