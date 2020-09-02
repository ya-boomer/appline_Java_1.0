import java.util.Scanner;

/**
 * Задача №14: Преобразование типов
 * Необходимо написать программу, которая будет реализовывать следующие действия:
 * 1. Ввод числа с клавиатуры и запись его в строковую переменную S
 *
 * 2. Конвертация строковой переменной S в числовую переменную X типа int
 *
 * 3. Конвертация числа X типа int в число Y типа double
 *
 * Все три числа разных типов необходимо в столбик вывести на экран
 */
public class TypeConversion {
    public static void main(String[] args) {
        //Принимаем от пользователя строку, просим число
        System.out.println("Введите число");
        Scanner in1 = new Scanner(System.in);
        String S = in1.nextLine();
        System.out.println(S);
        //Конвертация строковой переменной S в числовую переменную X типа int
        int X = 0;
        //Проверка что введенная строка действительно является числом
        try {
            //При вводе дробного десятичного числа метод отрабатывает не совсем корректно, преобразование
            //не происходит, чтобы решить эту проблему мы сначала округляем число до ближайшего целого вниз,
            //затем полученное число преобразовываем в тип int
            X = Integer.valueOf((int) Math.floor(Float.parseFloat(S)));
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
        System.out.println(X);
        //Конвертация числа X типа int в число Y типа double
        double Y = (double) X;
        System.out.println(Y);
    }
}
