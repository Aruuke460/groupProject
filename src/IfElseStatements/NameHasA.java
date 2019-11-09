package IfElseStatements;

import java.util.Scanner;

public class NameHasA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String validuser = "test";
        String validPass = "test123";

        System.out.println("Enter your username");
        String loginUser = input.nextLine();

        if(loginUser.equals(validuser)) {
            System.out.println("Enter your password");
            String loginPass = input.nextLine();

            if(loginPass.equals(validPass)) {
                System.out.println("Welcome");
        }
        else {
            System.out.println("Invalid password");
        }

    } else {
            System.out.println("Invalid username");
        }
    }

}