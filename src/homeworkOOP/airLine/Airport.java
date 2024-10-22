package homeworkOOP.airLine;



import java.util.Arrays;


public class Airport {
    private final AirVehicle[] airVehicles;


    public Airport(AirVehicle[] airVehicles) {
        this.airVehicles = airVehicles;

    }

    public int getTotalSeats() {
        int totalSeats = 0;
        for (AirVehicle airVehicle : airVehicles) {
            totalSeats += airVehicle.getSeat();
        }
        return totalSeats;
    }

    public int getTotalCapacityUP() {
        int totalCapacityUP = 0;
        for (AirVehicle airVehicle : airVehicles) {
            totalCapacityUP += airVehicle.getCapacityUP();
        }
        return totalCapacityUP;
    }

    public String findEqualPlane(int seat, int capacityUP) {

        int howManyEqualsPlains = 0;
        for (AirVehicle nowPlaneEqualOrNot : airVehicles) {
            if (nowPlaneEqualOrNot.getSeat() == seat && nowPlaneEqualOrNot.getCapacityUP() == capacityUP && nowPlaneEqualOrNot instanceof Plain) {
                howManyEqualsPlains++;
            }
        }

        AirVehicle[] arrayPlanes = new AirVehicle[howManyEqualsPlains];

        for (int i = 0, j = 0; i < airVehicles.length; i++) {

            AirVehicle airVehicle = airVehicles[i];
            if (airVehicle.getSeat() == seat && airVehicle.getCapacityUP() == capacityUP && airVehicles[i] instanceof Plain) {
                arrayPlanes[j] = airVehicle;
                j++;
            }
        }

        return Arrays.toString(arrayPlanes);
    }
}
