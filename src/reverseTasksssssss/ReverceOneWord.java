package reverseTasksssssss;

public class ReverceOneWord {
    public static void main(String[] args) {
        String word = "cybertek";
        System.out.println(reversed(word));

    }
    public static String reversed(String word){   //calling method
        String reversed  = "";
        for(int i = word.length()-1; i>=0; i--){
            reversed += word.charAt(i);{
            }
        }
        return reversed;
    }
}
