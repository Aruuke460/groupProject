package ArraysTasks;

import methodstasks.Arrays.ArraysToString;

import java.util.Arrays;

public class AddTwoArraysTask {
    public static void main(String[] args) {

        int[] arrayOne = {11, 23, 4, 6, 90};
        int[] arrayTwo = {12, 4, -7, 8, -70};

        int[] sum = new int[arrayOne.length];

        for(int i = 0; i < arrayOne.length; i++){
            sum[i] = arrayOne[i] + arrayTwo[i];
        }
        System.out.println(Arrays.toString(sum) );

    }
}