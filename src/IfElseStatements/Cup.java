package IfElseStatements;

import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int passCode = 1234;
        int pass1 = scanner.nextInt();
        if(pass1 == passCode) {
            System.out.println("Welcome to Iphone");
        }
        else if (passCode < 0){
            System.out.println("No negative numbers");
        }
        else{
            System.out.println("Try again");
        }


    }
}
