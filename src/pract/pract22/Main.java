package pract.pract22;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

//Создайте матрицу размера n*m. Создайте два потока, один из которых перемножает все
// значения в столбцах и потом находит сумму, а другой поток перемножает все значения в
// строках и тоже потом находит сумму. Определите какое число больше.
public class Main {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        AtomicInteger tread1Sum = new AtomicInteger();
        AtomicInteger tread2Sum = new AtomicInteger();
        int[][] matrix = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=random.nextInt(10);
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();

        }


        try (ExecutorService executor = Executors.newFixedThreadPool(10))
        {
            executor.execute(()->{
                int sum =0;
                for (int i = 0; i < m; i++){
                    int product=1;
                    for (int j=0;j<n;j++){
                        product=matrix[i][j]*product;
                    }
                    sum=product+sum;
                }
                tread1Sum.set(sum);
            });
            executor.execute(()->{
                int sum =0;
                for (int i = 0; i < n; i++){
                    int product=1;
                    for (int j=0;j<m;j++){
                        product=matrix[j][i]*product;
                    }
                    sum=product+sum;
                }
                tread2Sum.set(sum);
            });
        }
        finally {
            System.out.println("all treads closed");
        }



        System.out.println(tread1Sum);
        System.out.println(tread2Sum);
    }
}
