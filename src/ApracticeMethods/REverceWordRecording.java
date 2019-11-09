package ApracticeMethods;

public class REverceWordRecording {
    public static void main(String[] args) {

        System.out.println(reversed("aruuke"));

    }

    public static String reversed(String word){
        String reversed = "";
        for(int i = word.length()-1;i>=0; i--){
            reversed += word.charAt(i);

            }
            return reversed;

    }
}
