package HomeworkTasks;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String erica = input.next();

        char r1 = erica.charAt(4);
        char r2 = erica.charAt(6);
        char r3 = erica.charAt(7);

        System.out.print(r1 + ""  + r2 + "" +r3);

    }
}
