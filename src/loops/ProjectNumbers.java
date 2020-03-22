package loops;

import java.util.Scanner;

public class ProjectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String user = input.nextLine();

        int a = user.length() / 2;
        String word1 = " ";
        String word2 = "";
        String word3 = "";

        if(user.length() >= 3 && user.length() <= 100) {
            user = user.toLowerCase();
            if (user.length() % 2 == 1) {
                System.out.println("its odd word");
                word1 = user.substring(0, a);

                char b = user.charAt(a);
                String midLetter = Character.toString(b);

                word2 = midLetter.toUpperCase();
                word3 = user.substring(a + 1);

                System.out.println(word1 + word2 + word3);

            } else {
                System.out.println("its even word");
                word1 = user.substring(0, a - 1);
                word2 = user.substring(a - 1, a + 1).toLowerCase();

                word3 = user.substring(a + 1);
                System.out.println(word1 + word2 + word3);

            }
        }else {
                System.out.println("Invalid length of character");
            }
        }
    }
