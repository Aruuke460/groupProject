package AAObjectClassPractice;

import java.util.Scanner;

public class House {
    String type;
    String address;
    int numRooms;


    public void info(){
        System.out.println("\nType: " + this.type);
        System.out.println("Address: " + this.address);
        System.out.println("numRooms: " + this.numRooms);

    }
}
