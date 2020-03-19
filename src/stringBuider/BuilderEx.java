package stringBuider;

public class BuilderEx {
    public static void main(String[] args) {
        StringBuilder ab = new StringBuilder("Aruuke ");
        ab.append("Kydyr");
        System.out.println(ab);

        StringBuilder ab1 = new StringBuilder("practice");
        ab1.deleteCharAt(1);
        System.out.println(ab1);

        StringBuilder ab2 = new StringBuilder("ketchup");
        ab2.delete(1,5);
        System.out.println(ab2);

        StringBuilder abw = new StringBuilder("akrrrr");
        abw.reverse();
        System.out.println(abw);
    }

}