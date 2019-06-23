//6) В банк положили S денег. Какой станет сумма вклада через N лет,
// если процент 1,5% добавляется к сумме вклада ежемесячно.

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double percent = 1.5;


        System.out.println("Введите сумму влаживаемых средств ");
        double sum = scanner.nextDouble();
        System.out.println("Введите количество лет хранения депозита");
        int year = scanner.nextInt();
//        Вариант с выбором процента
//        System.out.println("Введите ежемесячный процент начисления");
//        double percent = scanner.nextDouble();

        for (int i = 0; i < year; i++) {
            for (int j = 0; j < 12; j++) {
                sum = sum + (sum / 100) * percent;
            }
        }
        System.out.println("Сумма вашего вклада составит " + sum);
    }
}
