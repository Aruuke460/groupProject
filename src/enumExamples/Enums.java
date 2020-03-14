package enumExamples;

public class Enums {
    public static void main(String[] args) {
        checkDays(Days.Wednesday);

    }

    public static void checkDays(Days day){
        switch(day){
            case Monday:
                System.out.println("Mondays are bad");
                break;
            case Tuesday:
            case Wednesday:
            case Thursday:
                System.out.println("Regular day");
                break;
            case Friday:
                System.out.println("Fridays are great");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Weekends are the best");
                break;
        }
    }
}
