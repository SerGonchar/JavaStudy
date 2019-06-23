/*3) Найти количество счастливых билетиков на трамвай от 000001 до 999999
(те у которых сумма первых 3 цифр равна сумме последних 3)
*/


public class HappyTicket {
    public static void main(String[] args) {

        int happyTicket = 0;
        for (int i = 1000; i < 1000000; i++) {   // начало отсчета с 1000 т.к. минимальное значимый для нас номер 001001
            if (i / 100000 + (i / 10000) % 10 + (i / 1000) % 10 == (i / 100) % 10 + (i / 10) % 10 + i % 10) {
                happyTicket = happyTicket + 1;
            }
        }
        System.out.println("Количество счастливых билетов в диапазоне от 000001 до 999999 - " + happyTicket);
    }
}