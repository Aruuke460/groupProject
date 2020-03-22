package multidemensionalArray;

import java.util.Arrays;
import java.util.Random;
//Create a method that will generate a random 2D int array.
// Take two parameters. The first one for how many 1D arrays
// you want, and second how many elements each 1D array should have

public class return2darray {
    public static void main(String[] args) {
        int [][] number = createRandom2DArray(4,5);
        System.out.println(Arrays.deepToString(number));

    }

    public static int [][] createRandom2DArray(int numofArrays, int numofElements){
        int [][] arr = new int[numofArrays][numofElements];
        Random random = new Random();

        for(int i =0;i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                arr [i][j] = random.nextInt(100);
            }
        }
        return arr;
    }
}
