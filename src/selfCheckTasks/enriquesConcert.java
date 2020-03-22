package selfCheckTasks;

public class enriquesConcert {
    public static void main(String[] args) {
        int [] prices = {60, 70, 100,90,56,87,55};

        int count =0;
        int sumOfNums =0;

        for(int i = 0;i< prices.length; i++){
            if(prices[i] > 60){
                count++;
            }
            sumOfNums = sumOfNums + prices[i];
        }
        System.out.println("Number of values greater than 60: " +count);
        int mean = sumOfNums / prices.length;
        System.out.println("Mean: " +mean);
    }

}
