package pract1;

public class Fraction {
    //    Создайте класс с именем Fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
//
//Конструктор класса должен инициализировать их заданным набором значений.
//
//Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
//
//метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
//
//метод, умножающий (произведение) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат умножения;
//
//метод, делящий (деление) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.
//    3  4
//    5  6
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction addFractions(Fraction fractionToAdd) {
        int resultNumerator;
        int resultDenominator;
        resultDenominator = this.denominator * fractionToAdd.denominator;
        resultNumerator = (this.numerator * fractionToAdd.denominator) + (fractionToAdd.numerator * this.denominator);
        Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
        return resultFraction;
    }
    public Fraction multiplyFraction(double number){
        double resultNumerator;
        resultNumerator= number*this.numerator;
        Fraction resultFraction = new Fraction((int) resultNumerator, this.denominator);
        return resultFraction;
    }
}
