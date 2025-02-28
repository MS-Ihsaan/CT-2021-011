package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence with exclamation mark: ");
        String word = scanner.nextLine();

        int exclamationIndex = word.indexOf('!');
        String firstString = word.substring(0,exclamationIndex).trim();
        String secondString = word.substring(exclamationIndex+1).trim();

        System.out.println("Before exclamation mark: "+firstString);
        System.out.println("After exclamation mark: "+secondString);
    }
}
