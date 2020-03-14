package wednesdayExamples;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        String [] shows = {"Doctor Who","Friends","Game of Thrones","Greys Anatomy","Prison Break"};

        Arrays.sort(shows);
        System.out.println("Sorted list of shows: ");

        for(int i=0; i<shows.length; i++){
            System.out.println("# " + i + " " + shows[i]);
        }
    }
}
