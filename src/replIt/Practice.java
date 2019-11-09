package replIt;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number");

        int number = input.nextInt();

        if(number%2 == 1) {
            System.out.println("Weird");
            }
        else if (number % 2 == 0 && number > 2 && number < 5) {
                System.out.println("Not weird");
            }
        else if(number % 2 == 0 && number > 6 && number < 20) {
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }

    }}
