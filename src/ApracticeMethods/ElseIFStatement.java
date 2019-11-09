package ApracticeMethods;

import java.util.Scanner;

public class ElseIFStatement<number> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  grade:");

        int number = scan.nextInt();
        System.out.println(number);

        if (number >= 90 && number <= 100) {
            System.out.println("A");
        }
        else if(number >= 80 && number <= 90){
            System.out.println("B");
        }
        else if(number >= 70 && number <= 80){
            System.out.println("C");
        }
        else if(number >= 60 && number <= 70){
            System.out.println("D");
        }
        else if(number >= 50 && number <= 60){
            System.out.println("E");
        }
        else if(number >= 40 && number <= 50){
            System.out.println("F");
        }
        else if(number >= 0 && number <= 40){
            System.out.println("G");
        }
        else{
            System.out.println("The number you entered is not in the range");
        }
    }
}