package ApracticeMethods;

public class ReversedWord {
    public static void main(String[] args) {
        String word = "cybertek";
        System.out.println(reversed(word));

    }
    public static String reversed(String word){
        String reversed  = "";
        for(int i = word.length()-1; i>=0; i--){
            reversed += word.charAt(i);{
            }
        }return reversed;
    }
}
