package HomeworkTasks;

import java.util.Scanner;

public class AccountNUmber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your accpunt number");
        String num = input.nextLine();
        String firstNumber = num.substring(0,1);
        boolean invalid = firstNumber.equals("5") || !firstNumber.equals("2");

        if(invalid) {
            System.out.println("Invalid account number");

        }else {
            if(firstNumber.equals("5")) {
                System.out.println();
            }
        }
    }
}
