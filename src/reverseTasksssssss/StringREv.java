package reverseTasksssssss;

public class StringREv {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String [] arr = sentence.split(" ");
        String revSentence = "";
        for(int i = arr.length-1; i >= 0; i--){
            revSentence += arr[i] + " ";
            System.out.print(revSentence);
        }
    }
}
