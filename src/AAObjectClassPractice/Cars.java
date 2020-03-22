package AAObjectClassPractice;

public class Cars {
   /*1. Create a class Car
Instance variables: make, year, sportEdition, mileage
Methods:
drive -> print “%year %make is driving” -> increment mileage by 10
drive -> accepts String(destination) -> print “%year %make is driving to %destination”
-> increment mileage by 10
drive -> accepts integer(mile) -> print “%year %make is driving %mile miles”
-> increment mileage by given mile.*/
   String brand;
   int year;
   boolean sportEdition;
   int mileage;


   public void drive(){
       System.out.println(year + " " + brand + " is driving");
       mileage += 10;
      // System.out.println(mileage);
   }
   public void drive(String destination){
       System.out.println(year + " " + brand  + " is driving to " + destination );
       mileage += 10;
      // System.out.println(mileage);
   }

   public void drive(int miles){
       System.out.println(year + " " + brand + " is driving mile " + miles);
       mileage += miles;
      // System.out.println(mileage);
   }
}
