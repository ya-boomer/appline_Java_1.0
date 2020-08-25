/**
 * Задача №4: Отработка поразрядных операций
 * Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 */

import java.util.Scanner;

public class Bin2Decim {
    public static void main(String[] args) {
        //Вводим любое значение с клавиатуры
        System.out.println("Введите значение:");
        Scanner in1 = new Scanner(System.in);
        int number = in1.nextInt();
        System.out.println(toDec(String.valueOf(number)));

    }

    //Цикл с преобразованием полученного числа в десятичную систему.
    static int toDec(String base2) {
        char[] chars = base2.toCharArray();
        int result = 0;
        int mult = 1;
        for (int i = base2.length()-1; i >= 0; i--) {
            if (chars[i]=='1') {
                result += mult;
            }
            if (chars[i]=='-') //Проверка на отрицательное значение
            {
                result *= (-1);
            }
            mult*=2;
        }
        return result;
    }
}