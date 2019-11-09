package IfElseStatements;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.nextLine().charAt(0);
        switch (letter){
            case 'a':
            case 'A':
                System.out.println("Excellent");
                break;
            case 'b':
            case 'B':
                System.out.println("Okay");
                break;
            case 'd':
            case 'D':
                System.out.println("You can do better");
                break;
            case 'f':
            case 'F':
                System.out.println("Something needs to change");
                break;
            case 'j':
                System.out.println("Perfect");
                break;
            default:
                    System.out.println("Not a valid letter grade");

        }
    }
}
