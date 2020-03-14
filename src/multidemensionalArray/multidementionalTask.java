package multidemensionalArray;

public class multidementionalTask {
    public static void main(String[] args) {
       // Create a 2D int array that has 3 inner arrays with some initial values.
       // Print out the length of each inner array.
      //  > Given int array of ,1[[4,2,3], [3232,11,13, 4, 2], [233]]
      //  Length of row 1: 3
      //  Length of row 2: 5
      //  Length of row 3: 2
        int [][] numbers =  {{4,2,3}, {3245,11,13,4,2}, {23,13}};

        System.out.println("Length of row 1: " + numbers[0].length);
        System.out.println("Length of row 2: " + numbers[1].length);
        System.out.println("Length of row 3: " + numbers[2].length);
    }
}
