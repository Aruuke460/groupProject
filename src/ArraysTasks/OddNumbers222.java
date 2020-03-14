package ArraysTasks;

public class OddNumbers222 {
    public static void main(String[] args) {
        int [] arrNumbers = {11,45,67,8,9,98,543,55};

        for(int i =0; i < arrNumbers.length; i++){
            if(arrNumbers[i]%2==1){
                System.out.println(i);

            }
        }
    }
}
