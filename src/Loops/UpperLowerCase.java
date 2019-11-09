package Loops;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();

        if(user.length() >= 3 && user.length() <= 100) {
            user = user.toLowerCase();

        }else{
                System.out.println("Invalid enter");
            }
        }
    }