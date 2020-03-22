package accessModifier;

public class Chair {
    public int size;
    public String model;

    public void setSize(int size){
        this.size = size;   //setter method
    }

    public void info(){
        System.out.println("Model: " + this.model);
        System.out.println("Size: " + this.size);
    }
}
