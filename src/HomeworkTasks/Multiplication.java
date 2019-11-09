package HomeworkTasks;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= 10; j++) {

                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}