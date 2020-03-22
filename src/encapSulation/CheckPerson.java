package encapSulation;

public class CheckPerson {
    public static void main(String[] args) {
       Person person =new Person("Aruuke", 27);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
