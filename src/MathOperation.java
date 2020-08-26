/**
 * Задача №6: Отработка арифметических операций
 * Написать программу, которая будет выполнять следующие действия:
 *
 * 1. Ввод трех чисел с клавиатуры x, y, z
 *
 * 2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
 *
 * 3. Деление среднего арифметического на 2 без остатка
 *
 * 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        double average = (x + y + z)/3;
        System.out.println("Среднее арифметическое трех чисел равно: " + average);
        int result = (int) (average / 2);
        System.out.println("Деление среднего арифметического на 2 без остатка равно:" + result);
        if (result > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
