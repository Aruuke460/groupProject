package AvatarClasssssss;

import java.util.ArrayList;

public class Array667CodingBat {
    public static void main(String[] args) {
        System.out.println(array667(testData(6, 3, 6, 1, 6 )));
    }
    public static int array667(ArrayList<Integer> nums) {
        int count = 0;
        for(int i=0; i < nums.size()-1; i++) {
            if(nums.get(i) == 6) {
                if(nums.get(i+1) == 6 || nums.get(i+1)== 7) count++;
            }
        }
        return count;
    }
    public static ArrayList<Integer> testData (int ... nums) {
        ArrayList <Integer> list =  new ArrayList<>();
        for(int num: nums) {
            list.add(num);
        }
        return list;
    }
}





