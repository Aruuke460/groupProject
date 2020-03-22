package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int roll;
    String name;
}
public class EdurekaExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(); //list1 can only store OBJECTS

        ArrayList list2 =  new ArrayList();   //list2 can store any type of object

        list1.add("James");
        list1.add("Joe");
        list1.add("Jordan");
        list1.add("Kutya");
        list1.add("JOne");
        list1.add("James");
       // list1.add(10); //error because primitive data type

        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "Mike";

        list2.add("erica");
        list2.add(10);
        list2.add(2.3);
        list2.add('A');
        list2.add(s1);

            //1. Print reference to list -> shall print elements in the list the
        System.out.println("list1 is : " + list1);
        System.out.println("list2 is : " + list2);

            //2. Get the element from the list
        String name = list1.get(2);
        System.out.println("name is: " + name);
        Object o = list2.get(2);
        System.out.println("o is: " + o);

              //3.Update element in list
        list1.set(2,"Fionna");
        System.out.println("list1 now is: " + list1);

             //4.remove element from list
        list1.remove(2);
        System.out.println("list1 after remove is: " + list1);

             //to remove all of them from the list
             //list1.clear();

        if(list1.contains("James")){
            System.out.println("James is contains in the list");
        }
           //Iterate in ArrayList

        System.out.println("======Iterating with For Loop");
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.println("==========");

        System.out.println("=======Iterating with Enhanced For Loop======");
        for(String str : list1){
            System.out.println(str);
        }
        System.out.println("==========");
        System.out.println("=======Iterator with Iterator=====");
        Iterator<String> itr = list1.iterator();
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());

        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Kutya")){
                itr.remove();
            }
        }
        System.out.println("==========");
        System.out.println("list1 after iteration(removing) is : " + list1);








    }
}
