package finalAndMemory;

public class Blue {

    final String name = "Jason"; //it's always gonna be Jason from now on
    //it is an instance variable
    public static void main(String[] args) {

        final int k;
        System.out.println("Program");
        k = 23;
        System.out.println(k);//k = 12; // we won't be able to change the value,it's already assigned
        System.out.println();
        Blue b = new Blue();
       //b.name = "Mark"; we can no  give a different name
        System.out.println(b.name);

    }
}
