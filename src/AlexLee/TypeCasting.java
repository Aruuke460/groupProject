package AlexLee;

public class TypeCasting {
    public static void main(String[] args) {
        int i = (int)3.8;  //3   IMPLICITLY CASTING
        System.out.println(i);  //output is 3 because will accept a Whole number

        double d1 = 200;   //200.0
        System.out.println(d1);  //converted to double number
        long l = i;
        System.out.println(l);

        double price = 200.55;    //EXPLICITLY CASTING
        int iPrice = (int)price;  //from double to int
        System.out.println(iPrice);
    }
}
