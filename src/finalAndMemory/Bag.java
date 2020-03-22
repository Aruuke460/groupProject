package finalAndMemory;

public class Bag {
    final String color;
    final int size;// final instance variable must be initialized
    //Once it is initialized then value for the color cannot be changed.

    //Option 1: Initialize it right away.Give a value when declaring the instance variable
    /*final static  int totalBags;

    //Option 2: Initialize it within the constructor.Because instance variables cannot be used
    without creating an onject.If we use constructor to initialize the FINAL INSTANCE VARIABLE,
    IT ALLOWS.

    //OPTION 3: INSTANCE INITIALIZER BLOCK.IT IS used to initialize instance variables. It is
    same as static block but it's for non-static variables.Instance iniializer block gets executed
    right before constructor.

    //Why to use initializer block?
    -We could be running few different codes to bring a value to initialize.
    -In initializer block we can run any code.But we can't write any
    code at instance variable level.

    static {
        totalBags = 45;

    }
    public Bag(){
        this.color = "red";
    }
    public Bag(String color){
        this.color = color;
    }
}*/{
    size = 4;   //hard coded means writing the value right away.
    }
    public Bag(){
    this.color = "Red";

    }
    public Bag(String color){
        this.color = color;
    }
}
