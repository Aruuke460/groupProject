package returnDataType;

public class ReturnExample {
    public static int getThree(){
        return 3;
    }
    public static String getDate(){
        String date = "11/3/2019";
        return date;
    }
    public static void main(String [] args){
        int a = getThree() + 7;
        System.out.println(a);

        String date = getDate();
        System.out.println(date);
    }
}
