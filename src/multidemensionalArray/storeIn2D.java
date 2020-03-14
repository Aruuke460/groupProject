package multidemensionalArray;


import java.util.Arrays;

public class storeIn2D {
    public static void main(String[] args) {
        String [][] groups = new String[3][];
        String [] arr1 = {"name1", "name2", "name3","name4"};
        String [] arr2 = {"james", "adam"};
        String [] arr3 = {"sofi","matt","jon"};

        groups [0] = arr1;
        groups [1] = arr2;  //we stored them all in one  2D line
        groups [2] = arr3;

        System.out.println(Arrays.deepToString(groups));
    }
}
