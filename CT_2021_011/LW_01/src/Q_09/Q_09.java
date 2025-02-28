package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String input = scanner.nextLine();

        int count = input.length();

        String firstChar = input.substring(0,1);
        String lastChar = input.substring(count-1,count);

        System.out.print("Number of characters of your sentence: "+count+"\n");
        System.out.println(firstChar);
        System.out.println(lastChar);
    }
}
