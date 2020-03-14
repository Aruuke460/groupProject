package AlexLee;

public class ExcepEx {
    public static void main(String[] args) {
        try {
            int[] b = {2, 3, 4, 5, 7};
            System.out.println(b[9]);
        } catch (Exception e) {
            System.out.println("Exception happened");
        }
    }
}