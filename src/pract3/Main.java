package pract3;


import java.util.Random;
import java.util.Scanner;

//Реализуйте игру “Угадай число” от 1 до 100 с подсказкой - “искомое число больше/меньше”
//При неправильном вводе, обработайте ошибку и сообщите пользователю
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != randomNum) {
            System.out.println("введите число от 1 до 100: ");
            num = scanner.nextInt();
            if(num>100||num<1){
                throw new InvalidInputException("Введите коректное число от 1 до 100");
            }
            if (num>randomNum){
                System.out.println("Искомое число меньше");
            }else if(num<randomNum){
                System.out.println("Искомое число Больше");
            }
        }
        System.out.println("Вы угадали число-"+randomNum);


    }

}
