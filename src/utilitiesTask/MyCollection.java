package utilitiesTask;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {

    /**
     * This method creates list of String
     *
     * @return
     */

    public static ArrayList<String> getStringList() {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter word: ");
            words.add(scanner.nextLine());
            System.out.println("Are you done? Y/N");
            if (scanner.nextLine().equals("Y")) {
                break;
            }
        }
        return words;  //bcoz return keyword
    }

    public static ArrayList<String> filterList(ArrayList<String> words, int size) {
        ArrayList<String> newWords = new ArrayList<>();
        for (String s : words) {
            if (s.length() == size) {
                newWords.add(s);
            }
        }
        return newWords;
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> words) {
        ArrayList<String> newWords = new ArrayList<>();
        for (String s : words) {
            if (newWords.contains(s)) {
                continue;
            }
            newWords.add(s);
        }
        return newWords;
    }

}