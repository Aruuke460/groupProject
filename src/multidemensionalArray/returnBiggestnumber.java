package multidemensionalArray;

import java.util.Arrays;

public class returnBiggestnumber {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 5, 564, 3, 44}, {22, 33, 44, 5, 6}, {12, 2200000, 33, 44}};
        System.out.println(biggestNumber2dArray(arr));
        // i is for whole array (specific array)?
        // j is for each array { } seperate
    }

    public static int biggestNumber2dArray(int[][] twoDarr) {
        int biggest = twoDarr[0][0];
        for (int i = 1; i < twoDarr.length; i++) {
            for (int j = 0; j < twoDarr[i].length; j++) {
                if (twoDarr[i][j] > biggest) {
                    biggest = twoDarr[i][j];
                }
            }
        }

        return biggest;
    }

}