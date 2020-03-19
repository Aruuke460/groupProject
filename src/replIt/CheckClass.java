package replIt;

public class CheckClass {
    public static void main(String[] args) {
        Mysyk.eat();
        Mysyk.color = "white";
        System.out.println(Mysyk.color);  //INSTANCE variabledin PRINT.OUT'u jok owon uchun
        // ar bir variabldi print kylabyz
        //There is no "sout" print out for instance variables
        //no need to create an ObJECT


        Mysyk mysyk = new Mysyk();
        mysyk.age = 3;
        mysyk.name = "pepe";
        mysyk.play();


    }
}
