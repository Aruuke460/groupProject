package BreakStatement;

public class SwitchBreakExample {
    public static void main(String[] args) {


        int i = 1;

        switch (i) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One!");
                break;
            default:
                System.out.println("WTF man?");
                break;
        }
    }
}