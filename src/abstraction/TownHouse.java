package abstraction;


public class TownHouse extends Home{
    public void shareWithNeighbor(){
        System.out.println("Sharing is caring");
    }


    @Override
    public void throwParty(){
        System.out.println("Party at TownHouse");
    }
    @Override
    public void lock(){
        System.out.println("Locking the townHouse");
    }
    @Override
    public void unlock(){
        System.out.println("Unlocking the townHouse");
    }
    @Override
    public void cook(){
        System.out.println("Cooking at townhouse");
    }

}
