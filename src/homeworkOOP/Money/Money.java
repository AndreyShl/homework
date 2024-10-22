package homeworkOOP.Money;

public class Money {
    //    1. Класс Деньги для работы с денежными суммами. Число должно быть представлено двумя полями типа int
//        для рублей и копеек. Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
//        Реализовать сложение, вычитание и операции сравнения. В функции main проверить эти методы.
// * Учесть кол-во рублей и копеек при выводе на экран: рубля/рублей копейки/копеек

    private final int rub;
    public String rubIndex;
    public String sentIndex;
    private final int cent;

    public Money(int rub, int sent) {
        this.rub = rub;
        this.cent = sent;
    }

    private String checkEndRub() {
        if (rub % 10 >= 2 && rub % 10 <= 4) {
            rubIndex = " рубля ";
        } else if (rub % 10 == 1) {
            rubIndex = " рубль ";
        } else {
            rubIndex = " рублей ";
        }
        return rubIndex;
    }

    private String checkEndSent() {
        if (cent % 10 >= 2 && cent % 10 <= 4) {
            sentIndex = " копейки ";
        } else if (cent % 10 == 1) {
            sentIndex = " копейка ";
        } else {
            sentIndex = " копеек ";

        }
        return sentIndex;
    }

    public Boolean equalsWalletOrNot(Money secondWallet) {
        boolean equalWallOrNot;
        equalWallOrNot = this.rub == secondWallet.rub && this.cent == secondWallet.cent;
        return equalWallOrNot;
    }

    public Money sumWallet(Money secondWallet) {
        int resultRub;
        int resultCent;
        resultRub = this.rub + secondWallet.rub;
        resultCent = this.cent + secondWallet.cent;
        if (resultCent >= 100) {
            resultRub += 1;
            resultCent -= 100;
        }
        return new Money(resultRub, resultCent);

    }

    public Money subtractionWallet(Money secondWallet) {
        int resultWal;
        int resultRub;
        int resultCent;
        resultWal = (this.rub*100+this.cent)-(secondWallet.rub*100+secondWallet.cent);
        resultRub =resultWal/100;
        resultCent =resultWal%100;
        return new Money(resultRub,resultCent);
    }

    @Override
    public String toString() {
        return rub + "," + cent + " " + rub + checkEndRub() + cent + checkEndSent();
    }


}
