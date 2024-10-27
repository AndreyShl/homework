package homeworkOOP.airLine;

import java.util.Comparator;

public abstract class AirVehicle  {

    private int seat;
    private int capacityUP;
    private String name;



    public AirVehicle(int seat, int capacityUP,String name) {
        this.seat = seat;
        this.capacityUP = capacityUP;
        this.name=name;
    }

    public int getSeat() {
        return seat;
    }

    public String getName() {
        return name;
    }

    public int getCapacityUP() {
        return capacityUP;
    }
//    public String getNameVehicle(){
//        String string = getClass();
//
//        return string;
//    }


    @Override
    public String toString() {
        return "AirVehicle{" +
                "seat=" + seat +
                ", capacityUP=" + capacityUP +
                ", name='" + name + '\'' +
                '}';
    }
}
