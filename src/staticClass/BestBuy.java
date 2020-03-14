/*package staticClass;

public class BestBuy {
    String location = "Chicago";
    static int numOfComputers;  //declaration
    static String day;
    static int employees; //is not static bcoz we don't know how many employees they have

    static {
        numOfComputers = 50;    // initialization
        System.out.println("run first");
        day = "monday";                     //static block will execute one time and run
    }
    static{
        System.out.println("Run 2nd");
        if(day.equals("monday")){
        numOfComputers = 60;
    }else{
            numOfComputers =20;
        }

    public static void printComputer(){
        System.out.println(numOfComputers); //code blocks are everything in the curly braces(empty)
    }
        static {

        }

        }

}*/
