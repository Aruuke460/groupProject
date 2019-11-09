package IfElseStatements;

import java.util.Scanner;

public class PasswordUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "Cybertek";
        String password = "Cybertek123";

        System.out.println("Please enter your user name:");
        String enteredname = scanner.nextLine();

        if(enteredname.equals(username)) {
            System.out.println("Please enter your password");

            String enteredpassword = scanner.nextLine();
            if(enteredpassword.equals(password)) {
                System.out.println("Login succesfull!");

            } else {
                System.out.println("Wrong password");
            }
            }
            else {
                System.out.println("Invalid username. Try again");


        }
    }

    }