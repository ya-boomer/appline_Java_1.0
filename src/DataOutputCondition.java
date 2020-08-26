/**
 * Задача №7: Условие вывода данных
 * Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры
 * число в переменную number. В программе должны присутствовать константы X, Y, Z.
 * Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести
 * на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
 * Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */

import java.util.Scanner;

public class DataOutputCondition {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int X = 10;
        int Y = 20;
        int Z = 30;
        if (number == X || number == Y || number == Z)
        {
            System.out.println("Данное значение имеется в константах");
        }
        else
        {
            System.out.println("Такой константы нет!");
        }
    }
}
