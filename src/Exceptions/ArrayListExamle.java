package Exceptions;

import java.util.ArrayList;

public class ArrayListExamle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("book");
        list.add("note");
        list.contains("something");
        System.out.println(list.get(2));
    }
}
