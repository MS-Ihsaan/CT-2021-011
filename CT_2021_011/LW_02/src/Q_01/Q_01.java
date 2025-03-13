package Q_01;
import java.lang.*;

public class Q_01 {
    public static void main(String[] args) {
        int A=2, B=3,C=4,X=5,Y=6;
        System.out.println("A=2, B=3,C=4,X=5,Y=6");

        double squreRoot1 = Math.sqrt((Math.pow(B,2)+(4*A*C)));
        System.out.println("The squre root of (B^2+4AC): "+squreRoot1);

        double squreRoot2 = Math.sqrt((X+4*Math.pow(Y,3)));
        System.out.println("The square root of (X+4Y^3): "+squreRoot2);

        double cubeRoot = Math.cbrt(X*Y);
        System.out.println("The cube root of the product of X and Y: "+cubeRoot);

        final double PI = 3.14;
        int radius = B;
        double areoOfCircle = PI*B*B;
        System.out.println("The area of a circle which radius is 3: "+areoOfCircle);
    }
}
