package AlexLee;

import java.util.Scanner;

public class FavNUmExcep {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("What is your fav number?");
            int c = scan.nextInt();
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("Sorry,please enter a number");
        }

    }
}