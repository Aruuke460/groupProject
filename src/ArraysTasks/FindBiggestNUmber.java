package ArraysTasks;

public class FindBiggestNUmber {
    public static void main(String[] args) {
        int [] numbers = {111,543,66,78,89};

        int max = (numbers[0]);

        for(int i =0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
