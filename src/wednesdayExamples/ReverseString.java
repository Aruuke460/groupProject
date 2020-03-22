package wednesdayExamples;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "We went to picnic today";
        String[] words = sentence.split(" ");
        String revSentence = "";
        System.out.println(Arrays.toString(words));

        for(String word : words){
            for(int i = word.length()-1; i>=0; i--){
                revSentence += word.charAt(i);
            }
            revSentence += " ";
        }

        System.out.println(revSentence.trim());
    }


}