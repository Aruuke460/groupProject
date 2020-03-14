package stringBuilder;

public class SbMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Car");
        //sb.deleteCharAt(1);
        sb.reverse();
        sb.delete(0,2);
        sb.insert(0,"hello");
        System.out.println(sb);
    }
}
