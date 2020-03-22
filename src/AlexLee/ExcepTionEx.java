package AlexLee;

public class ExcepTionEx {
    public static void main(String[] args) {
        try {
            int[] nums = {2, 3, 4, 5};
            System.out.println(nums[2]);

        } catch (Exception e) {
            System.out.println("Exception happened");
        }
    }
}
