package ArraysTasks;

public class EvenNumbers {
    public static void main(String[] args) {
        int [] numbers = {11,33,44,56,78,99};
        for(int i = 0; i< numbers.length; i++){

            if(numbers[i]%2==0){     //it will print the position of numbers (2,3,4)are even numbers
                System.out.println(i);
            }
        }
    }
}
