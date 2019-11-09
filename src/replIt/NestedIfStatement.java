package replIt;

public class NestedIfStatement {
    public static void main(String[] args) {
        String fruit ="lemon";
        String apple = "green";


        // fruit equal orange
        // no, it is not orange
        //true: else{
        // nested apple equal red
        //apple is not red
        // apple equal yellow
        // apple is not yellow
        // else => apple is green

        if(fruit.equals("orange")) {
            System.out.println("No,its not orange");
        }
        else {
            if (apple.equals("red")) {
                System.out.println("Apple is not red");

            }
           else  if (apple.equals("yellow")) {
                System.out.println("Apple is not yellow");
            }
           else {
                System.out.println("Apple is green");
            }
            System.out.println("It's not an apple");

        }  }

}
