package accessModifier;

public class PersonCheck {
    public static void main(String[] args) {
        PersonTask person = new PersonTask("Erica",27);
        person.setAge(25);
        person.setName("Aru");

        //person.getAge();
        //person.getName();
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
