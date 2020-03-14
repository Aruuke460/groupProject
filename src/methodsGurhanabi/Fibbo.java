package methodsGurhanabi;

public class Fibbo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i = 2; i < 10; i++){
            sum = a + b;  //1
            a = b;   //1
            b = sum;  //
            System.out.print(sum + " ");
        }
    }
}
