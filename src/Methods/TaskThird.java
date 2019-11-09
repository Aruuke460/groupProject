package Methods;

import java.util.Scanner;

public class TaskThird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String  name  = in.nextLine().toLowerCase();
        if(name.substring(0,1).equalsIgnoreCase("a")||
        name.substring(0,1).toLowerCase().equals("z")) {
            System.out.println("cool");

            if(name.startsWith("a") || name.startsWith("A") ||
                    name.startsWith("z") || name.startsWith("Z")) {
                System.out.println("Cool");
            } else {
                System.out.println("Not cool");
            }
        }

    }
}
