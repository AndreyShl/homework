package homeworkOOP.Money;

public class Main {
    public static void main(String[] args) {
//        1. Класс Деньги для работы с денежными суммами. Число должно быть представлено двумя полями типа int
//        для рублей и копеек. Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
//        Реализовать сложение, вычитание и операции сравнения. В функции main проверить эти методы.
//* Учесть кол-во рублей и копеек при выводе на экран: рубля/рублей копейки/копеек
//        2. Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//                Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность. Найти самолет в компании,
//        соответствующий заданному диапазону параметров.

        Money first = new Money(3,55);
        Money second = new Money(3,55);
        System.out.println(first.subtractionWallet(second));
        System.out.println(first.sumWallet(second));
        System.out.println(first.equalsWalletOrNot(second));




    }
}
