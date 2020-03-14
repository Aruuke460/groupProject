package selfCheckTasks;

import java.util.Scanner;

public class StringToINtnumbers {
    public static void main(String[] args) {
        String [] names = {"aruuke","slava"};
        int [] phoneNUmber = {111111,6666666};

        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);
        String enteredName = scan.nextLine();

        if(enteredName.equals("aruuke")){
            System.out.println(phoneNUmber[0]);
        }
        else if(enteredName.equals("slava")){
            System.out.println(phoneNUmber[1]);
        }
        else {
            System.out.println("Invalid username");
        }
    }
}
