package arraylists;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args) {
       // ArrayList<String> names = new ArrayList<>();
       // names.add("Jason");
       // names.add("Adam");
      //  names.add(1,"adam");//if I put 10- it'll say out of bound
       // System.out.println(names);
       // System.out.println(names.get(1)); //to get only one number
     // How to use List for any Objects.
        //ArrayList<String> words = new ArrayList
        ArrayList<Cat> catsForSale = new ArrayList<>();
        Cat cat1 =  new Cat();
        cat1.color = "white";
        cat1.age = 3;

        Cat cat2 = new Cat();
        cat2.color = "black";
        cat2.age = 4;

        catsForSale.add(cat1);
        catsForSale.add(cat2);

        System.out.println(catsForSale);// will print address of them(without size)
       // ArrayList<String> words = new ArrayList<>();
        for(int i = 0;i< catsForSale.size(); i++){
            System.out.println("Cat#" + (i+1));

            System.out.println("Color: " + catsForSale.get(i).color);
            System.out.println("Age: " +catsForSale.get(i).age);
        }
    }
}
