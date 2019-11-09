package Scanners;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your gender?");
        String gender = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is your phone number?");
        long number = scanner.nextInt();

        System.out.println("gpa?");
        double gpa = scanner.nextDouble();


    }
}
