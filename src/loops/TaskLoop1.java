package loops;

import java.util.Scanner;

public class TaskLoop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine();

        for (int i = 0; i < 15; i++) {
            System.out.println("Welcome " + name);

        }
    }
}