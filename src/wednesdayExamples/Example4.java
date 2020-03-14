package wednesdayExamples;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        String [] groceryList = {"apple","carrot","orange","cherry","strawberry"};
        Arrays.sort(groceryList);

        System.out.println("Index number of apple is: " + Arrays.binarySearch(groceryList,"apple"));
        System.out.println("Index number of orange is: " +Arrays.binarySearch(groceryList,"orange"));
    }
}
