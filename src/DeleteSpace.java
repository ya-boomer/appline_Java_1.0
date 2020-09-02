import java.util.Scanner;

/**
 * Задача №12: Удаление всех пробелов в заданном тексте
 * Для введенной с клавиатуры строки необходимо провести отсев пробелов.
 * Результат в виде строки без пробелов вывести на экран.
 */
public class DeleteSpace {
    public static void main(String[] args) {
        System.out.println("Введите строку с пробелами");
        //Считываем строку от пользователя и записываем в переменную
        Scanner in1 = new Scanner(System.in);
        String string1 = in1.nextLine();
        System.out.println("Без пробелов строка выглядит следующим образом:");
        //выводим строку без пробелов в консоль
        System.out.println(string1.replaceAll("\\s",""));
    }
}
