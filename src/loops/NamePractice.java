package loops;


import java.util.Scanner;

public class NamePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        for(int i = 0; i < 5; i++)
            System.out.println(name + " " +i);
    }


}
