//4) Заполнить массив случайными числами. Вывести элементы, которые больше среднего арифметического.

import java.util.Arrays;
import java.util.Random;

public class Average {
    public static void main(String[] args) {


        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
        int average = 0;
        for (int v : arr) {
            average = (average + v);
        }

        average = average / arr.length;
        System.out.println("Cреднее арифметическое масива " + average);
        for (int v : arr) {
            if (v >= average) {
                System.out.print(v + ", ");
            }
        }
    }
}






