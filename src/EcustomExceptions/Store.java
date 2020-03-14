//package EcustomExceptions;
//
//import java.util.Random;
//
//public class Store {
//    public static void main(String[] args) {
//        Laptop laptop = new Laptop();
//        try{
//            laptop.setOs("mac");
//            laptop.turnOn();
//        }catch(InvalidOSException e){
//            e.printStackTrace();
//        }

//    }
//    public void setOs(String os){
//        switch (os.toLowerCase()){
//            case "windows":
//            case "mac":
//            case "linux":
//                this.os = os;
//                break;
//            default:
//                throw new InvalidOSException();
//        }
//    }
//    public boolean turnOn(){
//        Random random = new Random();
//        int num = random.nextInt(11);
//        System.out.println(num);
//        if(num >= 8){
//
//        }
//
//
//    }
//}
