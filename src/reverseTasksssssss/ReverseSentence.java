package reverseTasksssssss;

public class ReverseSentence {
    public static void main(String[] args) {
        String words = "java is fun";
        String [] arrayOne = words.split("");

        String reversedVer = "";

        for(int i =arrayOne.length-1; i >=0; i--){
            reversedVer = arrayOne[i]+ " ";
            System.out.print(reversedVer);
        }
    }
}
