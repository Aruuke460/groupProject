package constructor;

public class Phone {
    boolean touchScreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Phone(String model, String color, int memory, boolean touchScreen) {
        this.model = model;
        this.color = color;
        this.touchScreen = touchScreen;
        if (memory < 0) {
            System.out.println("Invalid memory");
        } else {
            this.memory = memory;
        }
    }

    public void info() {
        System.out.println("Model: " + model);
        System.out.println("Memory: " + memory);
        System.out.println("color: " + color);
        System.out.println("touchscreen: " + touchScreen);
    }

    public boolean text(long phoneNumber, String message){
        String pString = phoneNumber+"";
        if(pString.length() == 10 && !message.isEmpty()){
            System.out.println(message + " is sent to" + phoneNumber);
            return true;
        }
        else {
            System.out.println("Invalid phone number of empty message");
            return false;
        }
    }
    public void call(long phoneNumber){
        String pString = phoneNumber+"";
        if(pString.length() ==10){
            System.out.println("Calling to " + phoneNumber);
        }
        else{
            System.out.println("Invalid Phone number");
        }
    }
}