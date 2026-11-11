package by.it_academy.practice.practice3;

import java.time.DayOfWeek;

public class ExampleSwitch {
    public static void main(String[] args) {
//        DayOfWeek day = DayOfWeek.MONDAY;
//
//        switch (day) {
//            case DayOfWeek.MONDAY:
//                System.out.println("Today is windy !");
////                break;
//            case DayOfWeek.THURSDAY:
//                System.out.println("Today is sunny !");
////                break;
//            case DayOfWeek.WEDNESDAY:
//                System.out.println("Today is rainy!");
//                break;
//
//        }

//        DayOfWeek day = DayOfWeek.THURSDAY;
//        if (day == DayOfWeek.MONDAY) {
//            System.out.println("Week day");
//        } else if (day == DayOfWeek.TUESDAY) {
//            System.out.println("Week day");
//        } else if (day == DayOfWeek.THURSDAY) {
//            System.out.println("Week day");
//        } else if (day == DayOfWeek.SATURDAY) {
//            System.out.println("Weekend day");
//        } else if (day == DayOfWeek.SUNDAY) {
//            System.out.println("Weekend day");
//        }



//        String day = "Sunday";
//        String massage;
//        switch (day) {
//            case "Monday":
//                massage = "Week day";
//                break;
//            case "Tuesday":
//                massage = "Week day";
//                break;
//            case "Wednesday":
//                massage = "Week day";
//                break;
//            case "Thursday":
//                massage = "Week day";
//                break;
//            case "Friday":
//                massage = "Week day";
//                break;
//            case "Saturday":
//                massage = "Weekend";
//                break;
//            case "Sunday":
//                massage = "Weekend";
//                break;
//            default:
//                massage = "Unknown day";
//        }
//        ;
//        System.out.println(massage);

//        String day = "Sunday";
//        String massage = switch (day) {
//            case "Monday" -> "Week day";
//            case "Tuesday" -> "Week day";
//            case "Wednesday" -> "Week day";
//            case "Thursday" -> "Week day";
//            case "Friday" -> "Week day";
//            case "Saturday" -> "Weekend";
//            case "Sunday" -> "Weekend";
//            default -> "Unknown";
//        };
//        System.out.println(massage);

        String day = "Sunday";
        String massage = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Week day";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println(massage);

    }
}
