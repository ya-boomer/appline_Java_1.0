import java.util.Scanner;

/**
 * Итоговая задача №1
 * Задание: Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать
 * в переменную int и вывести на экран. Необходимо использовать циклы, нельзя использования готовые
 * методы языка Java, для перевода числа из одной системы счисления в другую.
 */
public class FinalTask1 {
    public static void main(String[] args) {
        String bin;
        System.out.println("Введите бинарное значение");
        //считываем бинарное значение в строку
        Scanner in1 = new Scanner(System.in);
        bin = in1.nextLine();
        int index = bin.indexOf('0');
        int index1 = bin.indexOf('1');
        if (index == -1 || index1 ==-1) {
            System.out.println("Введено не бинарное значение");
        }
        else {
            int n = 0;
            // Производим перевод бинарного значения в десятичное
            for (int i = bin.length() - 1, j = 1; i >= 0; i--, j *= 2)
                n += (bin.charAt(i) - '0') * j;
            // Выводим полученный результат
            System.out.println("Полученное число = " + n);
        }
    }
}

