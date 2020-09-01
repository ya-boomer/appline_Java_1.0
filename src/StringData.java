/**
 * Задача №11: Ввод строки с клавиатуры
 * Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
 * Результат вывести на экран.
 */

import java.util.Scanner;

public class StringData {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        //Считываем строку от пользователя и записываем в переменную
        Scanner in1 = new Scanner(System.in);
        String string1 = in1.nextLine();
        //Выводим строку на экран
        System.out.println("Пользователь ввёл: " + string1);
    }
}
