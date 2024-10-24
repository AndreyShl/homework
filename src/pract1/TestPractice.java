package pract1;

public class TestPractice
{
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3,55);
        Fraction fraction2 = new Fraction(3,55);
        fraction1.printFraction();
        fraction2.printFraction();
        Fraction result = fraction1.addFractions(fraction2);
        result.printFraction();


    }
}
