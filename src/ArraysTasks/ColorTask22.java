package ArraysTasks;

public class ColorTask22 {
    public static void main(String[] args) {
        String [] colors = {"red","blue","black","green","white"};

        for(int i =0; i < colors.length; i++) {
            String color = colors[i];
            if(colors[i].length() >= 3) {
                System.out.println(color);
            }
        }

    }
}
