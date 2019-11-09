package ArraysTasks;

public class MinimumNumber {
    public static void main(String[] args) {
        int [] arr = { 2,5,7,87,54,32,6,9};
        int minimum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
    }
}
