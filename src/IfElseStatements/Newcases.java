package IfElseStatements;

import java.util.Scanner;

public class Newcases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of cats!");

        int numberOfcats = scanner.nextInt();
        switch (numberOfcats){
            case 0:
                System.out.println("Oh no,sorry!");
                break;
            case 1:
                System.out.println("Wow cool!");
                break;
            case 2:
                System.out.println("Aww so cute!");
                break;
            case 3:
                System.out.println("Are they triplets!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Unbelievable:" +  numberOfcats + "cats!");
                break;
            default:
                System.out.println("I don't believe you,don't lie!");


        }


    }
}
