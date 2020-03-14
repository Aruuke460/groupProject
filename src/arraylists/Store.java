package arraylists;

import objectClass.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String itemName;
    String address;
    int numberOfItems;
    double totalSales;  //info that object should have

    ArrayList<Item> items = new ArrayList<>();

    public Store(String name, String address) {
        this.itemName = name;
        this.address = address;
        System.out.println();
    }

    public void addItem(Item item) {
        this.items.add(item);
        numberOfItems++;
    }

    public void seeInventory() {  //its item information

        for (int i = 0; i < items.size(); i++)  //it's like display nothing else
            items.get(i).info();
        //for(Item item: items){
        //   item.info();

    }

    public void addItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of items to enter:  ");
        int enteredNum = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < enteredNum; i++) {
            System.out.println("Enter name for item: " + (i + 1));
            String name = scan.nextLine();
            scan.nextLine();

            System.out.println("Enter price for item#" + (i + 1));
            double price = scan.nextDouble();
            scan.nextLine();

            Item item = new Item(name, price);

            this.items.add(item);
            // items.add(item); //same without specifying
            this.numberOfItems++;
        }
    }

    public void sellItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equals(itemName)) {
                this.totalSales += items.get(i).price;
                items.remove(i);
                System.out.println("\nSuccessful transaction! Thank ");
                this.numberOfItems--;
                return;
            }
        }
        System.out.println("Item is not in stock");


    }


    public void returnItem(String itemName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of the returned item: ");
        double itemPrice = scanner.nextDouble();

        Item item = new Item(itemName,itemPrice);
        items.add(item);
        this.totalSales -= itemPrice;
        this.numberOfItems++;
        System.out.println("\nReturn process successful.");


    }
}


