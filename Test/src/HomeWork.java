import java.util.Random;

/*Дз9
1. Написать метод который принимает матрицу и число. Умножить каждый элемент на число.


*/
/*
//2. Вывести среднее арифметическое матрицы случайных чисел
public class HomeWork {
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

*/
/*
//7*. Задана матрица случайных чисел. Отсортировать матрицу.
public class HomeWork {
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
 */
/*
//3. Задана матрица случайных чисел. Пользователь вводит число. Вывести сколько раз это число встречается в матрице
public class HomeWork {
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
 */
/*


//8.* Повернуть матрицу на 90 градусов. например:
//1, 2, 3
//4, 5, 6
//Стало:
//4, 1
//5, 2
//6, 3
public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = n * i + j;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
*/

//4. Найти строку матрицы с максимальной суммой элементов
public class HomeWork {
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
        int махSum = 0;

        for (int j = 0; j < array.length; j++) {
            int sum = 0;
            for (int i = 0; i < array[j].length; i++) {
                sum = sum + array[j][i];
            }
            if (sum > махSum){
                махSum = sum;
                rowMatrixNumber = j;
            }
            //если sum > махSum, то махSum = sum и rowMatrixNumber = j;
        }

        System.out.println("Номер строки с максимальной суммой элементов " + rowMatrixNumber +", равной "+ махSum);

        // System.out.println(Arrays.toString(array[0]));

    }
}

/*

//1. Написать метод который принимает матрицу и число. Умножить каждый элемент на число.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int nam = 2;
        int n = 3;

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = n * i + j;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] result = multiMatrix(array, nam);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] multiMatrix(int[][] array, int nam) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] * nam;
                //умножить текущий элемент матрицы на число

            }
        }

        return array;
    }

}
*/
/*
//5. Написать метод который принимает матрицу и 2 индекса. Поменять местами строки матрицы с этими индексами

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int index1 = 0;
        int index2 = 1;
        int n = 3;

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = n * i + j;
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


        int[] temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;


        return array;
    }

}
*/