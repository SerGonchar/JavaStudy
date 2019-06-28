//4. Найти строку матрицы с максимальной суммой элементов

import java.util.Random;

public class MatrixMaxSum {
    public static void main(String[] args) {

        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]: ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int rowMatrixNumber = 0;
        int sumMax = 0;

        for (int j = 0; j < array.length; j++) {
            int sum = 0;
            for (int i = 0; i < array[j].length; i++) {
                sum = sum + array[j][i];
            }
            if (sum > sumMax) {
                sumMax = sum;
                rowMatrixNumber = j;
            }
        }
        System.out.println("Номер строки с максимальной суммой элементов " + rowMatrixNumber + ", равной " + sumMax);
    }
}
