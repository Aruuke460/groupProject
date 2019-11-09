package methodstasks;

import java.util.Arrays;

public class IntArrayReplace {
    public static void main(String[] args) {
        int [] arr2 = {3,-9,56,2,-5,78,21,-6};
        acceptIntandNumber(arr2,100);
        System.out.println(Arrays.toString(arr2));
    }

    public static void acceptIntandNumber(int [] arr, int change) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i]  = change;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
