package sortingloops;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {
        int [] numbers = {45,23,6,-3,66};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Index of -3 is: " +Arrays.binarySearch(numbers,-3));
    }
}
