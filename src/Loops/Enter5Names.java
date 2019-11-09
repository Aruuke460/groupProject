package Loops;

import java.util.Scanner;

public class Enter5Names {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
         int b = a.indexOf("project");
        int c = a.indexOf("alejandros");
       if(b > 0 && c > 0){
            System.out.println("read");

        }else {
            System.out.println("dont read");
        }




//        Scanner input = new Scanner(System.in);
//        String name;
//        for(int i = 0; i < 5; i++)
//            System.out.println("Enter name " + (i+1));
//            name = input.nextLine();
//        System.out.println(name);
    }
}