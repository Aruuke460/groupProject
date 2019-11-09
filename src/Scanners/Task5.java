package Scanners;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" \nTask5:");
        char char1 = input.nextLine().charAt(0);
        char char2 = input.nextLine().charAt(0);
        System.out.println(char1 > char2);
    }
}
