package replIt;
import java.util.*;

import java.util.Scanner;

public class Practice2 {
        public static void main(String[] args) {
            int c = 0;
            int a;
            int temp;
            int n = 153;
            temp = n;
            while(n > 0){
            a = n%10;
            n = n/10;
            c = c + (a*a*a);
        }
         if (temp == c)
        System.out.println("Armstrong number");
         else
        System.out.println("Not armstrong number");
    }
}