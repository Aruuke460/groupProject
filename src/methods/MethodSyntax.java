package methods;

public class MethodSyntax {
    public static void main(String[] args) {
        int n1 = 60;
        int n2 = 11;
        int n3 = methodName(n1,n2);
        System.out.println(n3);
    }

    public static int methodName(int a, int b) {
        int min;
        if(a > b){
            min = b;
        }else {
            min = a;
        }
        return min;

    }
}