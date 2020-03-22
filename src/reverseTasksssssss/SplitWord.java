package reverseTasksssssss;

public class SplitWord {
    public static void main(String[] args) {
        String word = "Cyber";
        String [] array2 = word.split(" ");
        String revWord = "";

        for(int i =array2.length-1; i >=0; i--){
            revWord = array2[i].charAt(i)+ " ";
            System.out.print(revWord);
        }
    }
}
