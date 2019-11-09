package ApracticeMethods;

import java.util.Arrays;

public class AddingNumberToArray {
    public static void main(String[] args) {
        addingToArray("98435361",10);
    }
    public static void addingToArray(String str,int num){
        String [] omg = str.trim().split(""); //omg[] = {"9","8","4","3","5","3"}
        int [] numbers = new int [omg.length];    //numbers [] = {0,0,0,0,0,0}

        for(int i = 0; i< omg.length; i++){
            numbers[i] = Integer.valueOf(omg[i]);
            numbers[i] += num;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
