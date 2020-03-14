package secondMax;

import methodstasks.Arrays.ArraysToString;

public class Array2ndMax {
    public static void main(String[] args) {
        int [] numbers = {2,3,7,5,2};
        System.out.println(max(numbers));

    }
    public static int max(int arr[]){
        int max = arr[0];
        int second = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = second;
                arr[i] = max;
            }
        }
        return second;
    }
}
