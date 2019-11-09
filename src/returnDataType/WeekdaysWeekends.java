package returnDataType;

public class WeekdaysWeekends {
    public static boolean isWeekday(String day) {
        day = day.toLowerCase();
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return true;
            case "saturday":
            case "sunday":
                return false;
            default:
                System.out.println("Invalid day provided");
                return false;
        }
    }

}
