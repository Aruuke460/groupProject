package Scanners;

import java.util.Scanner;

public class Secondtask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int one = input.nextInt();
        int two = input.nextInt();

        int count = 0;
        one += two;
        count++;
        System.out.println("Your number is one:" + one +  "after being incrementing " + two + " "+  count + "times");

    }
}
