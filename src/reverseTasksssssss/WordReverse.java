package reverseTasksssssss;

import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.nextLine();

        String revWord = "";

        for(int i = word.length()-1; i >= 0; i--){
            revWord += word.charAt(i);
        }
        System.out.println(revWord);
    }

}