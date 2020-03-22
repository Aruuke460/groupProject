package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TaskSet {
    public static void main(String[] args) {
//        Create a Set of numbers and ask the user to enter to enter 5 numbers.
//                - Go through each number and remove any numbers that are odd
//        - Print your Changed Set

        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextInt());
        }
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 1) {
                it.remove();
            }
        }
        System.out.println(numbers);

    }
}