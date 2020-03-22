package utilitiesTask;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolSystem {
    public static void main(String[] args) {
        MyCollection.getStringList();// this method is RETURN TYPE method
        //it will give a list of string


        String name = "Jason";
        int i = name.length(); //will return a numbers (int)
        //The containers has to match

        ArrayList<String> list = new ArrayList<>();
        list.add("Jason");
        list.add("Jon");
        list.add("Adam");
        list.add("Kani");
        list.add("Erica");
        list.add("Json");
        list.add("kani");
        System.out.println(list + "\n");

        ArrayList<String> k = MyCollection.removeDuplicates(list);
        System.out.println(k);
       // MyCollection.getStringList();

    }
}
