package inheritence;

public class School {
    String name;
    String address;     //proporties
    String type;

    public void giveHW(){
        System.out.println(this.name + "is giving home work");
    }
    public void  hostEvent(String  date) {
        System.out.println(this.name + " is hosting an event on " + date);

    }

}
