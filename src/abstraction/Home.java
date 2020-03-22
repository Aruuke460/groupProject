package abstraction;

public abstract class  Home {
    int numOfRooms;
    String address;
    int maxNumOfGuests;
//    Instance variables: numOfRooms, address, maxNumOfGuests;
//    Methods: throwParty, lock, unlock, cook.
//    Override toString method. Build and return all info about Home.
//      Concrete classes: Apartment, Townhouse, SingleHouse.
//    Townhouse additional methods: shareWithNeighbor.
//    SingleHouse additional methods: cutGrass, shovelSnow.
//    SingleHouse additional variable: garageType.
//    Override toString method and include garageType info.

public abstract void throwParty();

public abstract void lock();

public abstract void unlock();

public abstract void cook();

@Override
    public String toString(){
    String result = "Address: " + this.address + "\nNUmber of Guests; " + this.maxNumOfGuests +
            "\nNumber of rooms: " + this.numOfRooms;
    return result;
}

}
