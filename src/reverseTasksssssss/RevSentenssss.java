package reverseTasksssssss;

import java.util.Arrays;

public class RevSentenssss {
    public static void main(String[] args) {
        String  sentence = "Today's day is suck for me";
        String revSentence = "";

        for(int i = sentence.length()-1; i >= 0; i--){
            revSentence += sentence.charAt(i);
        }
        System.out.println(revSentence);
    }
}
