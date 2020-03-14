package methods;

public class TryMethod {
    public static void main(String[] args) {
        int num = 92;
        int num2 = 67;
        int num3 = newMethod(num,num2);
        System.out.println(num3);
    }
   public static int newMethod(int k,int j){
       int min;
       if(k > j){
           min = j;
       }else{
           min = k;
       }
       return min;
   }
}
