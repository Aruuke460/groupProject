package methodstasks;

public class ClassTask {
    public static void main(String[] args) {
        sayHello();
        printoddNumbers();
    }

    public static void sayHello() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello" + (i + 1));
        }
    }

    public static void printoddNumbers() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}