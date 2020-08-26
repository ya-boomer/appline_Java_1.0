/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести число  1.
 * Если пользователь ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1".
 * Если пользователь ввёл другое число, программа вообще ничего не должна делать.
 */

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in1 = new Scanner(System.in);
        int number = in1.nextInt();
        if (number==1)
        {
            System.out.println("Вы ввели число 1");
        }
    }
}
