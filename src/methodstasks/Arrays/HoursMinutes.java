package methodstasks.Arrays;

public class HoursMinutes {
    public static void main(String[] args) {
        printTheTime(2,50,true);

    }
    public static void printTheTime(int hour,int minutes,boolean amOrPm) {
        if((hour > 0 && hour <13) && (minutes>= 0 && minutes < 60)){
       String date = hour + " : " + minutes;
    if(amOrPm){
        date += " AM";
    }else{
        date += " PM";
    }
            System.out.println(date);
        }
    }
}
