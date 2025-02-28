package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fName = scanner.next();
        System.out.println("Enter middle name: ");
        String mName = scanner.next();
        System.out.println("Enter last name: ");
        String lName = scanner.next();

        String middleInitial = mName.substring(0,1);
        System.out.println(fName+" "+middleInitial+". "+lName);
    }
}
