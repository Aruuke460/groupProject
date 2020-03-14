package wednesdayExamples;

import java.util.Arrays;

public class MaxAndMinNum {
    public static void main(String[] args) {
        int[] grades = {15, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500};
        // Arrays.sort(grades);
        // System.out.println("Min value: " + grades[0]);
        // System.out.println("Max value: " + grades[grades.length-1]);
        //one way of doing

        int maxValue = grades[0];
        int minValue = grades[0];

        for (int i = 0; i < grades.length; i++) {

            if (maxValue < grades[i]) {
                maxValue = grades[i];
            }
            if (minValue > grades[i]) {
                minValue = grades[i];
            }
        }
        System.out.println("Max value: " + maxValue);
        System.out.println("Min value: " + minValue);
    }
}
