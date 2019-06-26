import java.util.Random;

/*Дз9
1. Написать метод который принимает матрицу и число. Умножить каждый элемент на число.

3. Задана матрица случайных чисел. Пользователь вводит число. Вывести сколько раз это число встречается в матрице
4. Найти строку матрицы с максимальной суммой элементов
5. Написать метод который принимает матрицу и 2 индекса. Поменять местами строки матрицы с этими индексами
6. Написать метод который принимает матрицу и 2 индекса. Поменять местами столбцы матрицы с этими индексами
7*. Задана матрица случайных чисел. Отсортировать матрицу.
8.* Повернуть матрицу на 90 градусов. например:
1, 2, 3
4, 5, 6
Стало:
4, 1
5, 2
6, 3
*/
/*
//2. Вывести среднее арифметическое матрицы случайных чисел

        int[][] array = new int[4][4];
        Random random = new Random();

//        for (int i = 0; i < array.length; i++) {           // вывод матрицы в консоль
//            System.out.println(Arrays.toString(array[i]));
//        }
        for (int i = 0; i < array.length; i++) {            // заполнение матрицы рандом
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);


            }
            System.out.println();
        }
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                average += array[i][j];
                // System.out.print(array[i][j] + " \t");
            }
            // System.out.println();
        }
        average = average / (array.length * array[0].length);
        System.out.println("Average = " + average);
    }
}

 */
public class HomeWork {
    public static void main(String[] args) {

        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("============================");
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0 + 1; k < array.length; k++) {
                    for (int l = 0 + 1; l < array[k].length; l++) {
                        if (array[i][j] >= array[k][l]) {
                            temp = array[i][j];
                            array[i][j] = array[k][l];
                            array[k][l] = temp;

                        }
                    }

                }
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }

    }
}