package forEachLoopExamples;

public class CityTask {
    public static void main(String[] args) {
        String[] cities = {"Chicago", "New York", "Madison", "Miami", "Washington"};
        boolean check = false;
        int count = 0;
        for (String city : cities) {
            if (city.equalsIgnoreCase("chicago")) {
                check = true;
                count++;
            }
        }
        if (check) {
            System.out.println("Windy city found " + count + " times");
        } else {
            System.out.println("Windy city not found");
        }

    }
}