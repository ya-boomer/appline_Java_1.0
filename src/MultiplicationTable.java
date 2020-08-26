/**
 * Задача №5: Таблица умножения
 * Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Введите число, по которому надо получить таблицу умножения");
        Scanner in1 = new Scanner(System.in);
        int number = in1.nextInt();
        //Оператор if не является циклом, это оператор ветвления
        if (number==0)
        {
            System.out.println("Любое число, умноженное на нуль будет равно нулю");
        }
        else
        {
            System.out.println("Произведение числа " + number + " с 1 " + "Равно " + number * 1);
            System.out.println("Произведение числа " + number + " с 2 " + "Равно " + number * 2);
            System.out.println("Произведение числа " + number + " с 3 " + "Равно " + number * 3);
            System.out.println("Произведение числа " + number + " с 4 " + "Равно " + number * 4);
            System.out.println("Произведение числа " + number + " с 5 " + "Равно " + number * 5);
            System.out.println("Произведение числа " + number + " с 6 " + "Равно " + number * 6);
            System.out.println("Произведение числа " + number + " с 7 " + "Равно " + number * 7);
            System.out.println("Произведение числа " + number + " с 8 " + "Равно " + number * 8);
            System.out.println("Произведение числа " + number + " с 9 " + "Равно " + number * 9);
            System.out.println("Произведение числа " + number + " с 10 " + "Равно " + number * 10);
        }

    }
}
