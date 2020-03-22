package inheritence;

public class PetSmart {
    public static void main(String[] args) {
        Huskey huskey = new Huskey();
        huskey.name = "Rex";
        huskey.age = 3;

        huskey.bark();
        System.out.println(huskey.name);

        huskey.furType = "Special fur";
        huskey.livInCold();


        CodingBootCamp code = new CodingBootCamp();
        code.name = "Cybertek";
        code.hostEvent("December 31");

    }
}
