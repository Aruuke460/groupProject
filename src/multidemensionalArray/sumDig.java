package multidemensionalArray;

import java.util.Arrays;

public class sumDig {
    // Create a method that will take 2d array and
    //return the difference between the sum of the diagonals
    public static void main(String[] args) {
        int [][] nums = return2darray.createRandom2DArray(4,4);
        System.out.println(Arrays.deepToString(nums));
        System.out.println(differenceOfSum(nums));
    }


    public static int differenceOfSum(int[][] arr) {
        int sumOne = 0;
        int sumTwo = 0;

        for (int i=0, j = arr.length-1; i < arr.length ;i++, j--){
            sumOne += arr[i][i];
            sumTwo += arr[j][i];
        }

        return Math.abs(sumOne - sumTwo);
    }
}