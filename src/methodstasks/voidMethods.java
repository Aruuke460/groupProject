package methodstasks;

public class voidMethods {
    public static void main(String[] args) {
        sayHi();
        sayBye();
        sayHello();

    }

    public static void sayHi() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Hi");
        }
    }
    public static void sayBye(){
        System.out.println("Bye");

    }


    public static void sayHello() {
        System.out.println("Hello");
    }

}