package methodstasks.Arrays;

import java.util.Scanner;

public class compareStrings {
    public static void main(String[] args) {
        stringContains("james is an agent","jsddjdk");

    }
    public static void stringContains(String str, String str2) {
        if(str.contains(str2)) {
            str.replace(str2,"");
            System.out.println(str.trim());
        }else {
            System.out.println("Try again");
            Scanner input = new Scanner(System.in);
            String again = input.nextLine();

            if(str.contains(again)) {

            }else {
                System.out.println("Out of tries");
            }
        }
    }
    }

