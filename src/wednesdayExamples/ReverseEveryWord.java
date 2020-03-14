package wednesdayExamples;

public class ReverseEveryWord {
    public static void main(String[] args) {
        String sentence = "We went to picnic today";
        String[] words = sentence.split("");
        String reversedSentence = "";

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedSentence += word.charAt(i);
            }
            reversedSentence += "";
        }
        System.out.println(reversedSentence.trim());
    }
}