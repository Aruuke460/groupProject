package reverseTasksssssss;

public class SentenceRev {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String [] arrayOne = sentence.split(" ");

        String revSentence = "";

        for(int i = arrayOne.length-1; i >=0; i--){
            revSentence = arrayOne[i]+ " ";
            System.out.print(revSentence);
        }
    }
}
