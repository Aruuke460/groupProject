package IfElseStatements;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class RandomTask {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Guess the number from 1 to 10");
        int userguess = input.nextInt();
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println(number);

        if(number == userguess){
            System.out.println("Congrats! You guessed right number!");

        }else if(userguess > number){
            System.out.println("Your guess is too high");

        }else if(userguess < number){
            System.out.println("Your guess is too less");
        }

    }

     {
    }
}
