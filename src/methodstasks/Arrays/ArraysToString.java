package methodstasks.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        int [] arr2 = {2,5,7,5,65};
        arr(arr2);

    }
    public static void arr (int [] array) {
        String result = "[";
        for(int num: array) {
            result += num + ",";

        }
        result = result.substring(0,result.length()-2)+ "]";
        System.out.println(result);
    }
}
