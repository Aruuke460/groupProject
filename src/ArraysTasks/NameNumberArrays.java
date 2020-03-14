package ArraysTasks;

import java.util.Scanner;

public class NameNumberArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scan.nextLine();

        int []  numbers = {111111,3333333,222222};
        String [] names = {"erica", "taji", "Aruk"};

        for(int i =0; i<names.length; i++){
           // if(name.equalsIgnoreCase(names[i])){
                System.out.println(names[i]+ "'s phone number: " + numbers[i]);
            }
        }
    }
//}
