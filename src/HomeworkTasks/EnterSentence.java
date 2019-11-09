package HomeworkTasks;

import java.util.Scanner;

public class EnterSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//User is asked to enter a sentence.Display the sentence
//with the first word moved to the end of the sentence.
//input: "Java is a fun language"
//output: "is a fun language"
        System.out.println("Enter your sentence");
        String sen = input.nextLine();

        int space = sen.indexOf("");
        String firstWord = sen.substring(0,space);
        String remain = sen.substring(space + 5);
        System.out.println(remain + " " + firstWord);
    }
}
