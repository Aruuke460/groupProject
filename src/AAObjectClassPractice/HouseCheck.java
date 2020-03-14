package AAObjectClassPractice;

import java.util.Scanner;

public class HouseCheck {
    public static void main(String[] args) {

        House myHouse = new House();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter house type:");
        myHouse.type = scanner.nextLine();

        System.out.println("Please enter house address");
        myHouse.address = scanner.nextLine();

        System.out.println("Please enter nuber of rooms:");
        myHouse.numRooms = scanner.nextInt();

       myHouse.info();

    }
}