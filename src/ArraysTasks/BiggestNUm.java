package ArraysTasks;

public class BiggestNUm {
    public static void main(String[] args) {
        int [] arr = {11,23,467,876,8,9};

        int max = arr[5];  //it has to be the length of arr(any number)

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
