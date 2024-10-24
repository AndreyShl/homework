package homeworkOOP.airLine;

public class Helicopter extends AirVehicle {

    public Helicopter(int seat, int capacityUP,String name) {
        super(seat, capacityUP,name);
    }

    private String getNameCLass(){
        return "Helicopter";
    }
}
