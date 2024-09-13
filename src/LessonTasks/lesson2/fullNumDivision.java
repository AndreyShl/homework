package LessonTasks.lesson2;

public class fullNumDivision {
    public static void main(String[] args) {
        int abcd=1030, ab=abcd/100,cd=abcd%100;
        System.out.println("ab = "+ab);
        System.out.println("cd = "+cd);
        int FinSum=ab+cd;
        System.out.println("Сумма цифр числа abcd = "+FinSum);
    }
}
