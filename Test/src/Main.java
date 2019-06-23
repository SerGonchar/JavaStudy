/*
1) прислать логин с github


3) Найти количество счастливых билетиков на трамвай от 000001 до 999999
(те у которых сумма первых 3 цифр равна сумме последних 3)

4) Заполнить массив случайными числами. Вывести элементы, которые больше среднего арифметического.

5) Поменять элементы массива следующим образом: первый и последний, второй слева и второй справа итд.

6) В банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется
 к сумме вклада ежемесячно.

*/

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[] arr = new int[6];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int average = arr[0];
        for (int i = 0; i < arr.length; i++) {
            average = (average + arr[i]);

            //   if (average > arr[i]) average = arr[i];
        }
        average = average / arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("среднее арифметическое масива " + average);
    }
}





