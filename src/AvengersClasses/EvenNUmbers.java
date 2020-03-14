package AvengersClasses;

public class EvenNUmbers {
    public static void main(String[] args) {
        String word = "banana";
        if(word.length() %2 == 0)
         word = word.toLowerCase();
        int mid = word.length();
        int midF = mid-1;
        String first = word.substring(0,midF);
        String middle = word.substring(midF,midF).toUpperCase();

        String last = word.substring(mid+1);


        System.out.println(first + middle + last);
    }
}
