package reverseTasksssssss;

import java.util.Scanner;

public class OneReverceWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        String revWord = "";

        for(int i =word.length()-1; i >= 0; i--){
            revWord += word.charAt(i);

            // System.out.println(revWord); //if its in the loop it'll print a lot of words(lairs)
        }
        System.out.println(revWord);  // true
    }
}
