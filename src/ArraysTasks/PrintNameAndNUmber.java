package ArraysTasks;

import java.util.Scanner;

public class PrintNameAndNUmber {
    public static void main(String[] args) {
        int [] numbers = {1111,333,444444};
        String [] names = {"erica","solo","pepe"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ur name");
        String givenName = scan.nextLine();

        if(givenName.equals("erica")){
            System.out.println(numbers[0]);
        }
        else if(givenName.equals("solo")){
            System.out.println(numbers[1]);
        }else if(givenName.equals("pepe")){
            System.out.println(numbers[2]);
        }
        else{
            System.out.println("Not valid name");
        }
    }
}
