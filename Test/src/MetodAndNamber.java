//1. Написать метод который принимает матрицу и число. Умножить каждый элемент на число.

import java.util.Arrays;

public class MetodAndNamber {
    public static void main(String[] args) {

        int namber = 2;
        int square = 3;

        int[][] array = new int[square][square];
        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                array[i][j] = square * i + j;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] result = multiMatrix(array, namber);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] multiMatrix(int[][] array, int namber) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] * namber;
            }
        }
        return array;
    }
}