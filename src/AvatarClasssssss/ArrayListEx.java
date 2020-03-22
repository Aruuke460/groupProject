package AvatarClasssssss;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        //1,5,10
        list.add(2, 7);
        //1, 5,7,10

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        }

        for(int num : list){
            if(num % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
//        if(list.get(0) % 2 == 0){
//            System.out.println("Even");
//        }
//            if(list.get(1) % 2 == 0) {
//                System.out.println("Even");
//            }
//            if(list.get(2) % 2 == 0) {
//                System.out.println("Even");
//
//            }
//            if(list.get(3) % 2 == 0) {
//                System.out.println("Even");
