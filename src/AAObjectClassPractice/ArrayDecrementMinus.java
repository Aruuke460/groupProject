package AAObjectClassPractice;

import java.util.ArrayList;

public class ArrayDecrementMinus {
    public static void main(String[] args) {

        ArrayList<Integer> arr =  new ArrayList<Integer>();
        arr.add(12);
        arr.add(45);
        arr.add(88);
        arr.add(90);
        for (int i = 0;i <  arr.size(); i++){
            if(arr.get(i).equals(arr.get(i))){
                arr.remove(arr.get(i));

            }
        }
        System.out.println(arr);
    }
}