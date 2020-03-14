package methods;

public class MaxNumber {
    public static void main(String[] args) {
        int num11 = 89;
        int num2 = 78;
        int num3 = findMax(num11,num2);
        System.out.println(num3);
    }
    public static int findMax(int a,int b){
        int max;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        return max;
    }
}
