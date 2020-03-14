package AAObjectClassPractice;

import java.util.Scanner;

public class PrintNamesAndNumbers {
    public static void main(String[] args) {
        String [] names = {"aruuke","anton","erica","mysyk"};
        int [] numbers = {11888,2245,3398765,4498765};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter ur name: ");
        String enteredName = scan.nextLine();

        if(enteredName.equals("aruuke")){
            System.out.println(numbers[0]);
        }else if(enteredName.equals("anton")){
            System.out.println(numbers[1]);

        }else{
            System.out.println("Invalid username");
        }

    }
}
