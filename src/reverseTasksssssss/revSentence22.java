package reverseTasksssssss;

import java.util.Scanner;

public class revSentence22 {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
     String enteredWord = scan.nextLine();

     String revWord = "";

     for(int i = enteredWord.length()-1; i >=0; i-- ){
         revWord += enteredWord.charAt(i);

     }
        System.out.println(revWord);
    }
}
