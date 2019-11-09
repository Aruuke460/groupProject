package Scanners;

import java.util.Scanner;

public class Newpract {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( "What is ur cats name?");
        String name = input.nextLine();
        System.out.println( " Welcome," + name + "!");

        System.out.println( "Where are you from?");
        String location = input.nextLine();

        System.out.println(" What time is it?");
        int time = input.nextInt();



    }
}
