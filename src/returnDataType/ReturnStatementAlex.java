package returnDataType;

public class ReturnStatementAlex {
    public static void main(String[] args) {
         printAMessage();
        int sum = add(5, 4);
        System.out.println(sum);
    }
    public static void printAMessage() {
        System.out.println("This is my first method");
    }
    public static  int add (int a, int b){
        return a + b;

    }
}
