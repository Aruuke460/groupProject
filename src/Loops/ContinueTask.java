package Loops;

import java.util.Scanner;

public class ContinueTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int words = word.length();

        for (int i = 0; i <= word.length(); i++) {
            System.out.println(word.charAt(--words));

        }

    }
}

