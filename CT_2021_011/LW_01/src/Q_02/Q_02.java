package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fName = scanner.next();
        System.out.println("Enter last name: ");
        String lName = scanner.next();
        JFrame frame = new JFrame();
        frame.setSize(350,250);
        frame.setTitle(fName+" "+lName);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
