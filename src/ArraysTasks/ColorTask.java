package ArraysTasks;

import java.util.Arrays;

public class ColorTask {
    public static void main(String[] args) {
        String [] colors = {"red","white","black","green"};
        //colors [0] = "red";
        //colors [1] = "white";
        //colors [2] = "black";
        //colors [3] = "green";
        for(int i =0; i < colors.length; i++) {
            String color = colors[i];
            if(colors[i].length() >=4) {
                System.out.println(color);
            }
        }

    }
}
