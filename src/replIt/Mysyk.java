package replIt;

public class Mysyk {
    String name;
    int age;
    static String color;           //STATIC BELONGS TO THE CLASS


    public static void eat() {       // STATICS BELONGS TO ONLY CLASS
        System.out.println("Cat is eating");

    }
    public void play(){
        System.out.println("Playing");  //non-static belongs to OBJECT
    }
}