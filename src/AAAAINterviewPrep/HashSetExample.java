package AAAAINterviewPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
       List<String> list = Arrays.asList("John","Sam","John");
       Set<String> set = new HashSet(list);
        System.out.printf
                ("Size of list is %s,size of set is %s,Is list unique: %s",
                list.size(), set.size(), list.size() == set.size());

       // String s = String.format("This is the list size %s", list.size());
        String s = String.format("\n%s\n%s\n%s", list.get(0),list.get(1),list.get(2));
        System.out.println(s);

        String message = String.format
                ("Unique values test failed.Expected: %s, but was: %s",
                        true, list.size() == set.size());
        System.out.println(message);

    }
}
