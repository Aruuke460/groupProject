package AlexLee;

public class TwoMax {
    public static void main(String[] args) {
        int [] nums = {11,22,33,44,55,-8};
        int max = nums[0];
        int max2 = nums[1];

        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(max2 < nums[j] && max > nums[j]){
                max2 = nums[j];
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
