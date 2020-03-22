package AlexLee;

public class SecodNumber {
    public static void main(String[] args) {
        int [] numbers = {11,22,33,44,55,66};
        int max = 0;
        int max2 = 0;

        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        for (int j = 0; j < numbers.length; j++) {
            if(max2 < numbers[j] && max > numbers[j]){
                max2 = numbers[j];
            }
        }}
        System.out.println(max);
        System.out.println(max2);
    }
}
