package interviewPrep;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {

    }
    public static boolean isPrimeNumber(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0) return false;

            }
        return true;
        }
        public static ArrayList<Integer> allPrimeRange(int range){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 2; i < range; i++){
            if(isPrimeNumber(i)){
                list.add(i);
            }
        }
        return list;
        }
    }

