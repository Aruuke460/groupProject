package replIt;

public class LongestWord {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        //	String[] words = new String[5];
        //	for(int i = 0; i < 5;  i++) {
        //	  words[i] = input.nextLine();
        String str = "aaa bbbbb whasstupppp longg jaaaaavvaaaaaaaaaa";
        String [] arr = str.trim().split(" ");

        int biggestLength = 0;
        String biggestWord = "";

        for(String word : arr) {
            if(word.length() > biggestLength) {
                biggestLength = word.length();
                biggestWord = word;
            }
        }
        System.out.println(biggestWord);

    }
}
