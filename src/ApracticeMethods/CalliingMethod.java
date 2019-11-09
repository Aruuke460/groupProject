package ApracticeMethods;

public class CalliingMethod {
    public static void main(String[] args) {
       // String  a = "cybertek";
       // String b = "yb";

        removesContain("cybertek","yb");
    }
    public static void removesContain(String strOne,String strTwo){
        String finalWord = "";
        if(strOne.contains(strTwo)){
            finalWord = strOne.replace(strTwo,"");
            System.out.println(finalWord);
        }
    }
}
