package objectClass;

public class CarClass {
    public static void main(String[] args) {
        Car cars1 = new Car();

        cars1.make = "Lexus";
        cars1.mileage = 5000;
        cars1.sportEdition = true;
        cars1.year = 2019;

        System.out.println(cars1.mileage);
        cars1.drive("Downtown");

        System.out.println(cars1.mileage);
        cars1.drive(213);

        System.out.println(cars1.mileage);



    }
}
