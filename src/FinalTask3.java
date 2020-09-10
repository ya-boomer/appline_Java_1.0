import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;

/**
 * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков
 * после запятой. (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80
 * долларов)
 */
public class FinalTask3 {
    public static void main(String[] args) {
        System.out.println("Введите текущий курс доллара");
        Scanner in1 = new Scanner(System.in);
        double course = 0.00;
        double amountRubles = 0.00;
        try {
            // Проверяем корректность ввода от пользователя, можно использовать любой знак в числе: "." или ","
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.FRANCE);
            course = numberFormat.parse(in1.next()).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("текущий курс доллара: " + course);
        System.out.println("Введите количество рублей, которые Вы хотите поменять на доллары");
        try {
            // Проверяем корректность ввода от пользователя, можно использовать любой знак в числе: "." или ","
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.FRANCE);
            amountRubles = numberFormat.parse(in1.next()).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("У Вас такое количество рублей:" + amountRubles);
        // Проверка корректности курса
        if (course == 0.00){
            System.out.println("При курсе 0.00 Вы не сможете обменять рубли на доллары");
        }
        else if (course < 0.00){
            System.out.println("Некорректное значение");
        }
        else {
            // Округление до двух знаков после запятой с понижением
            double scale = Math.pow(10, 2);
            double result = Math.floor((amountRubles / course) * scale) / scale;
            // Проверка корректности полученного результата
            if (result == 0){
                System.out.println("У Вас слишком мало рублей, Вы не можете произвести обмен");
            }
            else if (result < 0){
                System.out.println("Некорректное значение");
            }
            else {
                System.out.println("По текущему курсу Вы можете получить " + result + " долар(ов)");
            }
        }
    }
}
