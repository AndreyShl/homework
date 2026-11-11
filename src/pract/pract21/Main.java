package pract.pract21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*Есть двумерный массив. Вам нужно подсчитать сумму всех его элементов. Разделите массив на несколько строк,
и для каждой строки создайте отдельный поток, который будет подсчитывать сумму элементов в этой строке.
После завершения работы каждого потока добавьте его результат к общей сумме.*/
public class Main {
    public static void main(String[] args) {
        int[][] multiArray = {{1, 2, 3},
                {2, 3, 4},
                {4, 1, 2}};
        AtomicInteger sumArray= new AtomicInteger();
        List<Thread> threadList =new ArrayList<>();
        for (int i = 0; i < multiArray.length; i++) {
            int[] currentArray = multiArray[i];
            System.out.println(Arrays.toString(currentArray));
            Thread tread = new Thread(() -> {
                int currentSum = sumStr(currentArray);
                sumArray.set(sumArray.get() + currentSum);

            });
            tread.start();
            threadList.add(tread);
        }
        threadList.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(sumArray);


    }

    public static int sumStr(int[] arrayInt) {
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum = arrayInt[i] + sum;
        }
        return sum;
    }

}
