package inheritence;

public class MacBook extends Laptop{

    public void appleID(){

        super.memorySize =45;
    }
    public static void main(String[] args) {
        MacBook macbook = new MacBook();
        macbook.color = "Grey";
    }

}
