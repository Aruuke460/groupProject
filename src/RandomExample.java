import java.util.Arrays;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many group: ");
        int a = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter how many students in each group: ");
        int numInGroup = scan.nextInt();
        scan.nextLine();

        String [][] class1 = new String[a][numInGroup];
        for(int i =0; i<a; i++){
            System.out.println("for group "+ (i+1) );
            for(int j=0; i<numInGroup; i++)
                System.out.println("enter student : " + (i+1));
                class1[i][i] = scan.nextLine();

        }
        System.out.println(Arrays.deepToString(class1));
    }
}
