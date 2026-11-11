package pract.pract25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
//Распечатать график праздников на текущий год используя форматирование.
public class Main {
    public static void main(String[] args) {

        LocalDate womanDay= LocalDate.of(2024,3,8);
        LocalDate mansDay= LocalDate.of(2024,2,23);
        LocalDate newYear= LocalDate.of(2024,1,1);
        LocalDate dayOctobers= LocalDate.of(2024,11,7);
        List<LocalDate> hollyDays = List.of(womanDay,mansDay,newYear,dayOctobers);
        LocalDateTime now = LocalDateTime.now();
        hollyDays.forEach(localDate-> System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yy EEEE"))));



    }
}
