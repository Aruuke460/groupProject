package AlexLee;

public class MaxNUms {
    public static void main(String[] args) {
        int [] numbers = {11,22,5,-99,6543,3};
        int max = numbers[0];
        int max2 = numbers[1];

        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        for(int j = 0; j < numbers.length; j++){
            if(max2 < numbers[j] && max > numbers[j]){
                max2 = numbers[j];
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
