package by.it_academy.practice.practice2;

import java.time.DayOfWeek;

public class ExampleLogical {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek1 = DayOfWeek.SATURDAY;
        DayOfWeek dayOfWeek2 = DayOfWeek.SUNDAY;

        if (dayOfWeek1 == DayOfWeek.SATURDAY && dayOfWeek2 == DayOfWeek.SUNDAY) {
            System.out.println("Weekend!");
        }

    }
}
