package Loops;

import java.util.Scanner;

public class TwelveCharacters {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your number");
        String number = input.nextLine();
        boolean validlength = false;
        if(number.length() == 10 && number.length() > 12) {
            System.out.println("validlength");
        }



    }
}
