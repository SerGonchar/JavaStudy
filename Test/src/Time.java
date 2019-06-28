/*
2) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/
public class Time {

    public static void main(String[] args) {

        int result = 0;
        int time = 10000;
        for (int i = 0; i <= 2359; i++) {

            int first = (time / 1000) % 10;
            int second = (time / 100) % 10;
            int third = (time / 10) % 10;
            if (third >= 6) {
                third = third + 10;
            }
            int four = time % 10;
            if (first == four && second == third) {
                result++;
                System.out.println(first + "" + second + ":" + third + "" + four);
            }
            time++;
        }
        System.out.println("Симетричная комбинация на табло часов случаеться " + result + " раз");
    }
}
