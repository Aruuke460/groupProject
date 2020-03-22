package timBucahalka;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,6);

        Dog dog = new Dog("Rex",1,1,2,5,2,4,1,20,"Silky");
        dog.eat();
        dog.move();
    }
}
