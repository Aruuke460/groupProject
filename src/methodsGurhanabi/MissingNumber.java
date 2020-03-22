package methodsGurhanabi;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 12};

        MissingNum(arr);
    }

    public static void MissingNum(int[] a) {
        for (int i = 0; i <a[ a.length - 1]; i++) {
            boolean check = false;

            for (int b : a) {
                if (i == b) {
                    check = true;
                    break;
                }

            }
            if (check == false) {
                System.out.print(i + " ");
            }


        }
    }
}
