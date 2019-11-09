package HomeworkTasks;

import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username1 = "test";
        String pass = "test123";

        System.out.println("Enter your name:");
        String username2 = input.nextLine();

        if(username2.equals(username1)) {
            System.out.println("Enter your password");

            String password2 = input.nextLine();
            if (pass.equals(password2)) {
                System.out.println("Welcome");

            }
            else{
                    System.out.println("Invalid user pass");
                }

        }
            else{
                System.out.println("Invalid name");
            }
        }




    }

