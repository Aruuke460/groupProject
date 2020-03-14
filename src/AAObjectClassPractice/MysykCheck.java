package AAObjectClassPractice;

public class MysykCheck {
    public static void main(String[] args) {
        Mysyk Cat = new Mysyk();
        Cat.age  = 5;
        Cat.breed = "lolo";
        Cat.color = "white";
        Cat.weight = 21;

        Cat.play();
        System.out.println(Cat.age);
        System.out.println(Cat.breed);
        System.out.println(Cat.color);
        System.out.println(Cat.weight);

    }
}
