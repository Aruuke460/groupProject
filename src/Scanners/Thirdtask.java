package Scanners;

import java.util.Scanner;

public class Thirdtask{
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
         boolean b = one > two;
        System.out.println(b);
        System.out.println("Task 2: \n");

        boolean check = scanner.nextBoolean();
        System.out.println(!check);
    }
}
