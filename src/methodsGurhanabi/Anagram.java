package methodsGurhanabi;


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("guh","hug"));

    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char [] str1arr = str1.toCharArray();  //march--> m,a,r,c,h
        char [] str2arr = str2.toCharArray();  //charm--> c,h,a,r,m

        Arrays.sort(str1arr);
        Arrays.sort(str2arr);


        return Arrays.equals(str1arr,str2arr);



    }
}
