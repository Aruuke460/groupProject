package AAAAINterviewPrep;

public class IfelseEx2 {
    public static void main(String[] args) {
        boolean isMale = false;
        boolean isTall = true;

        if(isMale  || isTall){
            System.out.println("YOu are male and tall ");
        }else if(isMale && !isTall){
            System.out.println("YOu are male but short");
        }else{
            System.out.println("You are not male not tall");
        }
    }
}
