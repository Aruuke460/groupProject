package constructor;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone X","Gold");
        phone.info();
        phone.memory = 45;
        phone.info();
        Phone samsung = new Phone("Samsung Galaxy","Black",-45,true);
        samsung.info();

        System.out.println("--------");
         boolean result = samsung.text(1222342,"hello");
        System.out.println(result);
       phone.call(6743832L);
    }
}
