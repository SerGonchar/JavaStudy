//3. Задана матрица случайных чисел. Пользователь вводит число. Вывести сколько раз это число встречается в матрице


import java.util.Random;
import java.util.Scanner;

public class SearchMatrix{
    public static void main(String[] args) {

        int[][] array = new int[4][8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Ведите искомое число от 0 до 50");
        int search = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (search == array[i][j]) {
                    result++;
                }
            }
        }
        System.out.println("В матрице число "+ search+" найдено " + result + " раз/а.");
    }
}
