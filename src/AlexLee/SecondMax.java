package AlexLee;

public class SecondMax {
    public static void main(String[] args) {
        int [] numbers = { -1,-5,-4,-2,44,67,88};
        int max = numbers[0];    //o bigger then -1,-2,-3,-4
        int max2 = numbers[1];    //numbers in the [] are doesn't really matter

        for(int i = 0; i < numbers.length; i++) {
            if (max <  numbers[i]) {
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
