//6. Написать метод который принимает матрицу и 2 индекса. Поменять местами столбцы матрицы с этими индексами

import java.util.Arrays;

public class MetodIndexColumn {
    public static void main(String[] args) {

        int index1 = 1;
        int index2 = 2;
        int scuare = 3;

        int[][] array = new int[scuare][scuare];
        for (int i = 0; i < scuare; i++) {
            for (int j = 0; j < scuare; j++) {
                array[i][j] = scuare * i + j;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] result = multiMatrix(array, index1, index2);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] multiMatrix(int[][] array, int index1, int index2) {

        for (int i = 0; i < array.length; i++) {
            int temp = array[i][index1];
            array[i][index1] = array[i][index2];
            array[i][index2] = temp;
        }
        return array;
    }
}