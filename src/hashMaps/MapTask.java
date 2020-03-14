package hashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTask {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("First",1);
//        map.put("Second",2);
//        map.put("Third",3);
//        map.put("Forth",4);
//        Ask the user to enter a number from 1 to 4. Then print out the key that goes with the number they entered.
//        If the user enters a number that is not in the map print "Invalid Number"
        Map<String,Integer> map = new HashMap<>();
        map.put("First",1);
        map.put("Second",2);
        map.put("Third",3);
        map.put("Forth",4);

        System.out.println("Enter numbers from 1 to 4");
        int number = new Scanner(System.in).nextInt();

        if(!map.containsValue(number)){
            System.out.println("Invalid number");
            System.exit(0);
        }

        for(String key : map.keySet()){
            if(number ==  map.get(key)){
                System.out.println(key);
                break;
            }
        }

    }
}
