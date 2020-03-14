package AAAAINterviewPrep;

public class IfElseEx {
    public static void main(String[] args) {
        boolean isMale = false;
        boolean isTall = true;

        if(isMale || isTall){
            System.out.println("You are male and tall");
        } else if(isMale && !isTall){
            System.out.println("You are a short male");

        }else {
            System.out.println("YOu are not male not tall");
        }
    }
}
