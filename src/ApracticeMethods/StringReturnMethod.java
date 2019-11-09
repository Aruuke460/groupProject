package ApracticeMethods;

public class StringReturnMethod {
    public static void main(String[] args) {
        String shouting = caps("why are you so stupid?");
        System.out.println(shouting);

    }
    public static  String caps(String s){
        return s.toUpperCase();
    }
}
