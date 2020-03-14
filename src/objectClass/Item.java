package objectClass;

public class Item {
    public String name;
   public double price;
    int size;

    public Item(String name,double price) {
        this.name = name;
        this.price = price;
    }
     //overload the constructor that takes 3 parameters to set all 3 instance variables
    public Item(String name,double price,int size){
        this(name,price); // this is "constructor chaining"(putting them together)

        this.size = size;

        //we can call constructor inside another constructor
        //it is called constructor chaining
        //we can do it using 'this with the parenthesis
    }
        public void info(){
            System.out.println("\nName: " + name);
            System.out.println("Price: "+ price);
        }
    }

