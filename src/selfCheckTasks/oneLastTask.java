package selfCheckTasks;

import java.util.Scanner;

public class oneLastTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String enteredName = in.nextLine();

        String [] userNames = {"alia","uli","boors"};
        int [] numbers = {12334,87654,8765432};

        if(enteredName.equals("alia")){
            System.out.println(numbers[0]);
        }
        else if(enteredName.equals("uli")){
            System.out.println(numbers[1]);
        }
        else if(enteredName.equals("boors")){
            System.out.println(numbers[2]);
        }
        else{
            System.out.println("Invalid name");
        }
    }
}
