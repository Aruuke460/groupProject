package gitHubPractice;

import java.util.ArrayList;
import java.util.List;

public class ProQaList {
    public static void main(String[] args) {
        printStudentsName();

    }
    public static void printStudentsName(){

        ArrayList<String> names = new ArrayList<String>();
        names.add("Guliza");
        names.add("Aruuke");

        for(String name: names) {
            System.out.println(name);
           // System.out.println("2. "+name);
        }
    }
}

