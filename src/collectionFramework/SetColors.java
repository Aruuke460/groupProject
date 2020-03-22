package collectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetColors {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        Set<String> colors22 = new HashSet<>();

        Collections.addAll(colors,"red","blue","green","white");
        Collections.addAll(colors22,"pink","yellow","black","red");

        String sameColors = "";
        for(String color : colors){
            if(colors22.contains(color)){
                sameColors += color + "";
            }
        }
        System.out.println(sameColors);
        System.out.println();
        System.out.println(colors);
        System.out.println(colors22);  //okwowtordu chygaryp berdi




    }
}
