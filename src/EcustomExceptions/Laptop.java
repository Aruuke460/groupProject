package EcustomExceptions;

import java.util.Random;

public class Laptop {
    private String os;
    public boolean turnOn(){
        Random random = new Random();
        int num = random.nextInt(11);
        System.out.println(num);
        if(num >= 8){
            //computer doesn't turn on
            throw new LaptopNotTurningException();
        }
        return true;
    }
}

