package overloladingMethod;

public class dataTypePromotion {
    public static void main(String[] args) {
        float a = 45;
        int b = 5;
        long c = 7;
        calc(a);
        calc(b);
        calc(c);
    }

    public static void calc(int i){
        System.out.println("using int");
    }
    public static void calc(long l){
        System.out.println("using long");
    }
    public static void calc(float f){
        System.out.println("using float");
    }
}
