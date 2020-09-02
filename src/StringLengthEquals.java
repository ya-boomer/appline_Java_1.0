import java.util.Scanner;

/**
 * Задача №13: Сравнение двух строк
 * Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие
 * переменные. Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствующее сообщение.
 */
public class StringLengthEquals {
    public static void main(String[] args) {
        System.out.println("Введите 2 строки для сравнения длины");
        //Считываем строки от пользователя и записываем в переменную
        Scanner in1 = new Scanner(System.in);
        String string1 = in1.nextLine();
        String string2 = in1.nextLine();
        //Выполняем проверку длины строк, если строки равны выводится сообщение, что длины совпадают
        if (string1.length()==string2.length())
        {
            System.out.println("Длины строк совпадают");
        }
        //Если первая строка длиннее, чем вторая, выводим первую
        else if(string1.length()>string2.length())
            {
                System.out.println("Самая длинная первая строка:");
                System.out.println(string1);
        }
        //Если вторая строка длиннее, чем первая, выводим первую
        else
            {
                System.out.println("Самая длинная вторая строка:");
                System.out.println(string2);
        }
    }
}
