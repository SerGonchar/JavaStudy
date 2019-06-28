//7*. Задана матрица случайных чисел. Отсортировать матрицу.

import java.util.Random;

public class SortMatrix {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("============================");
        // int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        if (array[i][j] < array[k][l]) {
                            int average = array[k][l];
                            array[k][l] = array[i][j];
                            array[i][j] = average;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}