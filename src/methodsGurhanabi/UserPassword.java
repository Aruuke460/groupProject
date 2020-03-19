package methodsGurhanabi;


import java.util.Scanner;

public class UserPassword {
    public static void main(String[] args) {
        login();

    }

    public static void login() {

        String userName = "jon";
        String password = "asf33wq";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();

        System.out.println("Enter password");
        String password22 = scan.nextLine();

        if(userName.equalsIgnoreCase("jon") && password.equalsIgnoreCase(password22)){
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }


    }
}