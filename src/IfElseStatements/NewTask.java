package IfElseStatements;

import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter even or odd number");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");
        }

            else {
            System.out.println("Odd");
        }

        System.out.println("Enter 5 different integers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int evens = 0;
        int odds = 0;

        if(num1 % 2 == 0){
            evens++;
        }else{
            odds++;

        }

        }
    }