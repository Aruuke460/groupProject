package Loops;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class PrintLetterASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.nextLine().toUpperCase().trim().charAt(0);
        if(letter >= 65 && letter <= 90) {
            while (letter != 91) {
                System.out.println(letter++);
            }
        }else {
            System.out.println("Not a valid letter");
        }
    }
}
