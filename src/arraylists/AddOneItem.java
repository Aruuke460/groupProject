/*package arraylists;

import objectClass.Item;

import java.util.Scanner;

public class AddOneItem {

    public void addItem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items do you want to buy?");
        int enteredNum = scan.nextInt();
        scan.nextLine();

        for(int i =0; i < enteredNum; i++){
            System.out.println("Enter item name?");
            String name1 = scan.nextLine();
            scan.nextLine();

            System.out.println("Enter price");
            double price1 = scan.nextDouble();
            scan.nextLine();

            Item item = new Item(name1,price1);
           /* this.items.add(item);
            this.numberOfItems++;

        }
    }

*/