package homeworkOOP.airLine;

//        2. Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//                Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность. Найти самолет в компании,
//        соответствующий заданному диапазону параметров.

public class Main {
    public static void main(String[] args) {

        AirVehicle plain = new Plain(220,11,"plain");
        AirVehicle plain4 = new Plain(11,11,"plain4");
        AirVehicle plain41 = new Plain(20,11,"plain41");
        AirVehicle plain411 = new Plain(21,12,"plain411");
        AirVehicle plain4112 = new Plain(21,12,"plain4112");
        AirVehicle plain4113 = new Plain(21,12,"plain4113");

        AirVehicle plain2 = new Quadrocopter(21,12,"Quadrocopter");
        AirVehicle plain31 = new Helicopter(22,11,"Helicopter");
        AirVehicle plain32 = new Helicopter(22,11,"Helicopter");
        AirVehicle plain33 = new Helicopter(11,11,"Helicopter");

        AirVehicle[] airVehicles={plain,plain4,plain2,plain41,plain411,plain4112,plain4113,plain31,plain32,plain33};
        Airport airport = new Airport(airVehicles);

        System.out.println("Total seats: "+airport.getTotalSeats());
        System.out.println("Total Capacity: "+airport.getTotalCapacityUP());
        System.out.println("Find equal Plain:"+airport.findEqualPlane(21,12));



    }
}
