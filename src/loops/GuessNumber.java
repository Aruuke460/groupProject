package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random =  new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(100) +1;
        int guess = 0;
        int count = 0;
        System.out.println(randomNumber);
        do {
            System.out.println("Enter your guess");
            guess = input.nextInt();
            count++;

            if(guess < randomNumber) {
                System.out.println("Too low");
            } else if(guess > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("You guessed right after " + count + " tries !");
            }
        } while(randomNumber != guess);
    }
}
