// 5) Поменять элементы массива следующим образом: первый и последний, второй слева и второй справа итд.
import java.util.Arrays;
import java.util.Random;

public class Replace {

    public static void main(String[] args) {

        int[] arr = new int[11];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
