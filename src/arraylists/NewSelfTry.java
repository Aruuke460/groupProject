package arraylists;

import java.util.ArrayList;

public class NewSelfTry {
    public static void main(String[] args) {
        ArrayList<String> proQs = new ArrayList<>();

        proQs.add("Aruuke");
        proQs.add("Valentin");
        proQs.add("Anton");
        proQs.add("Slava");
        proQs.add("Aybuke");
        proQs.add("Jika");
        proQs.add("Hilmi");
        proQs.add("Bob");

        System.out.println("Is Aruuke in this group? " + proQs.contains("Aruuke"));
        System.out.println("Valiks order number is : " + proQs.indexOf("Valentin"));//return order number
        System.out.println("Anton: " + proQs.get(2));//returns string order
        System.out.println("Slava: " + proQs.contains("Slava"));
        System.out.println("Aybuke: " + proQs.get(4));//only if I know the order number
        System.out.println("Remove " + proQs.remove(5));

        //System.out.println(proQs.size());
        System.out.println(proQs.toString());

        for(int i = proQs.size()-1; i >=0; i--)
            System.out.print(proQs.get(i)+ " ");


    }
}
