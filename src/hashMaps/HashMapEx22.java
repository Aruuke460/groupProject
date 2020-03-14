package hashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapEx22 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,30);
        map.put(2,30);
        map.put(3,30);
        map.put(4,30);

        Set<Integer> set = new HashSet<>();

        for(Integer key : map.keySet()) {
            if(map.containsValue(map.get(key)));

        }
        System.out.println(set);

    }
}
