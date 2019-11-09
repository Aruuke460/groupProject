package splitArrayTasks;

import java.util.Arrays;

public class DeclareArrayTask {
    public static void main(String[] args) {
        //1.Declare array and store elements{45,23,6,-3,66}
        //2.Print out the index of -3 if it exists in the array
        int [] nums = {45,23,6,-3,66};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums,-3));
    }
}
