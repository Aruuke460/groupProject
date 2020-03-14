package ArraysTasks;

public class OddNumbers {
    public static void main(String[] args) {
        int [] numbers = {54,776,32,889,11,43,55,66};
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]%2==1){
                System.out.println(numbers[i]);
            }
        }
    }
}
