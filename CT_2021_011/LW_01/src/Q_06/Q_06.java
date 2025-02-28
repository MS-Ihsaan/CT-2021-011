package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("W: ");
        int width = scanner.nextInt();
        System.out.println("H: ");
        int height = scanner.nextInt();
        System.out.println("Enter the title: ");
        String tName = scanner.next();
        tName+=scanner.nextLine();
        scanner.close();

        JFrame frame = new JFrame();
        frame.setSize(width,height);
        frame.setTitle(tName);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
