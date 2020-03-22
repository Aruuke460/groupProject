package selfCheckTasks;

import java.util.Scanner;

public class AskUserNameandNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ur name:");
        String enteredNames = input.nextLine();

        String [] userNames = {"erica","pepe","lolo"};
        int [] numbers = {1111,33333,44444};

        if(enteredNames.equals("erica")){
            System.out.println(numbers[0]);
        }
        else if(enteredNames.equals("pepe")){
            System.out.println(numbers[1]);
        }
        else if(enteredNames.equals("lolo")){
            System.out.println(numbers[2]);
        }
        else{
            System.out.println("Not a valid name");
        }
    }
}
