package replIt;

public class AnimalCheck {
    public static void main(String[] args) {
        Animal.eat();        //method calling
        Animal.breed = "Huskey";
        Animal.weight = 12;          //declaring the values
        Animal.height = 6;
        //System.out.println(Animal.breed);   //Static Variables
        System.out.println(Animal.weight);
       // System.out.println(Animal.height);


        Animal animal = new Animal();  //Creating an object
        animal.age = 2;
        animal.color = "black";     //declaring
        animal.name = "Pepe";

        animal.sleep();    //printing out the method




    }

}
