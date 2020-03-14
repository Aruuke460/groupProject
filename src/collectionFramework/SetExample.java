package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();

        cars.add("BMW");
        cars.add("Lexus");
        cars.add("BMW");
        cars.add("Toyota");

        cars.add("Tesla");
        System.out.println(cars);  //no get for Set collection

        cars.add("Honda");
        System.out.println(cars);

//        List<String> car2 = new ArrayList(cars);
//        System.out.println(car2);
        for(String car : cars);


    }
}
