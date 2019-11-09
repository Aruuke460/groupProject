package HomeworkTasks;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean upper = false;
        int counter_upper =0;
        String password = input.nextLine();

        for(int i = 0; i<password.length(); i++)
            if((Character.isUpperCase(password.charAt(i))));
    }
}
