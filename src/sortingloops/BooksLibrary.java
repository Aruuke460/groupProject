package sortingloops;

import java.util.Arrays;
import java.util.Scanner;

public class BooksLibrary {
    public static void main(String[] args) {
        String [] books = {"Leaders eat last","Harry potter","Mindset","OCA","Eragon"};

        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
        Scanner input = new Scanner(System.in);
        System.out.println("ENter the book you want to replace");
        String book = input.nextLine();

        int index =Arrays.binarySearch(books,book);

        if(index >=0) {
            System.out.println("What book will you replace" + book+ "with");
            String newBook = input.nextLine();

        } else {
            System.out.println("Book not found");
        }
        System.out.println(Arrays.toString(books));





    }
}
