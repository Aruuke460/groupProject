package objectClass;

public class CatClass {
    public static void main(String[] args) {
        Cat  catDescrip = new Cat();

        catDescrip.name = "pepe";
        catDescrip.breed = "lolo";
        catDescrip.color = "white and black";
        catDescrip.size = 5;

        System.out.println(catDescrip.name);
        catDescrip.meow();
    }
}
