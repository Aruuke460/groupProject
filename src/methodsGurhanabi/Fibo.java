package methodsGurhanabi;

public class Fibo {
    public static void main(String[] args) {
        Fibonacci(10);

    }
    public static void Fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        System.out.print("The first " + n + " number of series are: ");
        for(int i = 2; i < n; i++){

            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
    }
}
