package collectionFramework;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("James");
        names.add("Sara");
        names.add("Adam");

        Iterator<String> it = names.iterator();
//        it.next();
//        it.next();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);

            if(name.equals("Ben")){
                it.remove();
            }
        }
        System.out.println(names);


    }
}
