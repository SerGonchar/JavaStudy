//2. Вывести среднее арифметическое матрицы случайных чисел

import java.util.Random;

public class AverageMatrix {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                average += array[i][j];
            }
        }
        average = average / (array.length * array[0].length);
        System.out.println("Average = " + average);
    }
}
