package IfElseStatements;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int bound;
        int number = random.nextInt(100);

        System.out.println(number);
    }
}
