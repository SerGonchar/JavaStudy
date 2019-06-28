//6) В банк положили S денег. Какой станет сумма вклада через N лет,
// если процент 1,5% добавляется к сумме вклада ежемесячно.

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double percent = 1.5;


        System.out.println("Введите сумму влаживаемых средств ");
        // Для работы с деньгами в Джава использовать следует класс BigDecimal
        //BigDecimal sum = scanner.nextBigDecimal();
        double sum = scanner.nextDouble();
        System.out.println("Введите количество лет хранения депозита");
        int year = scanner.nextInt();

        for (int i = 0; i < year; i++) {
            for (int j = 0; j < 12; j++) {
                //sum = sum.add(sum.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(percent)));
                sum = sum + (sum / 100) * percent;
            }
        }
        System.out.println("Сумма вашего вклада составит " + sum);
    }
}
