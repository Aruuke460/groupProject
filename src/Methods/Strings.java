package Methods;

public class Strings {
    public static void main(String[] args) {
        String word = "java";
        String fixed = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println("Fixed");

    }
}
