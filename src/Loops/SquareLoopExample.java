package Loops;



import java.util.Scanner;

public class SquareLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        for(int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }


}
