package returnDataType;

import java.util.Arrays;

public class FindDiferrence {
    public static void main(String[] args) {
    //Given a String of numbers. Return the difference
    // between the biggest and smallest number
     System.out.println(differenceFromString("9323234"));
    }
    public static int differenceFromString(String number) {
        String [] arr = number.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return Integer.valueOf(arr[arr.length-1]) - Integer.valueOf(arr[0]);
    }
}
