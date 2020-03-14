package objectClass;

public class Testing { //random class to be able to write smth
    public static void main(String[] args) {
       // String name = "James";    //if we write flag we should create an object otherwise
               //its no reason.it is already created in "library".Its only for me
        Flag f1 = new Flag();//create an object from a flag
              // we are taking same name(already created from previous class "Flag"
        f1.country = "USA";
        f1.color = "Red/white";
        f1.size = 5;
        f1.material = "wood";

       // Flag f2 = new Flag();
       // System.out.println(f1.country);
       // f1.flap();
        f1.info();

        Flag f2 = new Flag();
       // System.out.println();

        f2.info();
    }
}
