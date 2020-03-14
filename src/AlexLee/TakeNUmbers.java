package AlexLee;

public class TakeNUmbers {
    public static void main(String[] args) {

        String a = "Abs2_F34,w1";
        int sum = 0;
        String result = "";

        for (int i = 0; i < a.length(); i++){
            if(Character.isDigit(a.charAt(i))){
                sum += Integer.parseInt(a.charAt(i)+ "");
                 result  += a.charAt(i) + " + ";

            }

        }
        result  = result.substring(0,result.length());
        System.out.println(result + " = " + sum);

    }
}