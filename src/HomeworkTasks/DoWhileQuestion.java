package HomeworkTasks;

import java.util.Scanner;

public class DoWhileQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        int num =0;
        do{
            System.out.println("Enter the number");
            num = input.nextInt();

            input.nextLine();
            System.out.println("Do you want to continue?");
            answer = input.nextLine();
        } while(answer.toLowerCase().equals("y"));

    }
}
