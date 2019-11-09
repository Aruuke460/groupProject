package ArraysTasks;

import java.util.Arrays;
import java.util.Scanner; //enter names together

public class StoreNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] names = new String[5];
        for(int i =0; i < names.length; i++) {
            System.out.println("Enter name" + (i+1));
            names[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(names));
    }
}
