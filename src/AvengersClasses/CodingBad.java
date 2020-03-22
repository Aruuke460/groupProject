package AvengersClasses;

public class CodingBad {
    public static void main(String[] args) {
        String word = "eight";

        if(word.length()%2 == 1 ){
          word = word.toLowerCase();
          int mid = word.length()/2;

          String first = word.substring(0,mid);
          String middle = word.charAt(mid) + "";
          middle = middle.toUpperCase();
          String last = word.substring(mid+1);
            System.out.println(first + middle + last);
        }
    }
}
