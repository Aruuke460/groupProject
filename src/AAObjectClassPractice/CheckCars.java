package AAObjectClassPractice;


public class CheckCars {
    public static void main(String[] args) {
        Cars car = new Cars();

        car.brand = "toyota";
       car.mileage = 234;
       car.sportEdition = true;
       car.year = 2020;

        System.out.println(car.mileage);
        car.drive();

        System.out.println(car.mileage);
        car.drive("chicago");

        System.out.println(car.mileage);
        car.drive(125);
    }
}
