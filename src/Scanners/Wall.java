package Scanners;

import java.util.Scanner;

public class Wall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "What is the wall color?");
        String color = input.nextLine();

        System.out.println("What is the lenght?");
        int length = input.nextInt();
        input.nextLine();
        System.out.println( "Is it a good one?");
        String answer = input.nextLine();

        System.out.println( "Color:" + color);
        System.out.println( "Length:" + length);
        System.out.println( "Good:" + answer);

    }
}
