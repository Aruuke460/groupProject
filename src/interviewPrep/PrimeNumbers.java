package interviewPrep;

public class PrimeNumbers {
    public static boolean isPrimeNumber(int num) {
//negatives not prime numbers
//0 and 1 not the prime numbers Because it must be 2 divider numbers 1 and itself
// 2, 3, 5, 7, 11, 13, 15, 17, 19, 23, 29, 31,37...101, 139...337...997
        //
        if (num <= 1) {   //first condition >>equal and less then 1
            return false;
        }
        for (int i = 2; i < num; i++) { //it starting 2 because prime nums begins from 2
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(607));
    }
}

