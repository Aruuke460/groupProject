package loops;

import java.util.Scanner;

public class SumOfTwoNUmbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the lower range");
        int numOne = input.nextInt();

        System.out.println("Please input the upper range");
        int numTwo = input.nextInt();

        int sum = 0;

        for(int i = numOne; i <= numTwo; i++) {
            sum += i;
        }
    }
}
