package arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class CityLIstTask {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Chicago");
        cityList.add("Bishkek");
        cityList.add("Wisconsin");
        cityList.add("Miami");
        cityList.add("New York");
        cityList.add("Texas");
        cityList.add("N c");
        cityList.add(2,"xian");

        System.out.println("Is Miami in the list?" + cityList.contains("Miami"));
        System.out.println("The location of Chicago in the list? " + cityList.indexOf("Chicago"));
        System.out.println("What is the list number of Texas? " + cityList.indexOf("Texas"));
        System.out.println("Wisconsin is a good state: " + cityList.indexOf("Wisconsin"));
        System.out.println("Is the list empty? " + cityList.isEmpty()); // Print false

        System.out.println("North Coraline: " + cityList.get(6));

        //cityList.clear(); //clear all
        System.out.println("List size: " + cityList.size());

        cityList.remove(1);
        System.out.println(cityList);

        // Display the contents in the list in reverse order

        for (int i = cityList.size()-1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();



    }
}
