package ArraysTasks;

public class BIggestNumber {
    public static void main(String[] args) {
        int [] arr  = {11,23,888456,77,87,9,43};
        int max = arr[1];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
