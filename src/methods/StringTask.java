package methods;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Cybertek is located in Des Plaines";
        String word = input.nextLine();
        int index = str.indexOf(word);
        System.out.println(index);


    }
}
