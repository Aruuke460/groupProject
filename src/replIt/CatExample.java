package replIt;

import java.util.Scanner;

public class CatExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int length = str.length();

        char length1 = str.charAt(length-1);

        System.out.print(length1 + str + length1);

    }
}
