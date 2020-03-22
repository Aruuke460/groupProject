package reverseTasksssssss;

public class RevSentence {
    public static void main(String[] args) {
        String sentence = " java is fun";
        String [] futureSentence = sentence.split("");

        String revSentence = "";

        for(int i = futureSentence.length-1; i >= 0; i--){
            revSentence = futureSentence[i]+ "";
            System.out.println(revSentence);

        }
    }
}
