package inheritencePart2;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("march","charm"));
    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char [] str1arr = str1.toCharArray();
        char [] str2arr = str2.toCharArray();

        Arrays.sort(str1arr);
        Arrays.sort(str2arr);

        return Arrays.equals(str1arr,str2arr);

    }
}
