package Scanners;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println(" enter two numbers");
        int one = scanner.nextInt();
        int two = scanner.nextInt();

        boolean check = one == two;
        System.out.println(check);

    }
}
