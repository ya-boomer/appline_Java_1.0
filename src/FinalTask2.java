import java.util.Scanner;

/** Итоговая задача №2
 * Задание: Написать программу сортировки по возрастанию заданного пользователем массива чисел. Пользователь
 * программы должен задавать размер массива и наполнять его числами. Использовать одну из следующих сортировок:
 * прямого выбора, вставки, быстрая, Шелла.
 */
public class FinalTask2 {
    public static void main(String[] args) {
        //Получаем длину массива, проверяем корректность данных создаем массив
        System.out.println("Введите размерность одномерного массива");
        Scanner in1 = new Scanner(System.in);
        int size = 0;
        try {size = in1.nextInt();}
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
        int[] array1 = new int[size];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < size; i++) {
            try {array1[i] = in1.nextInt();}
            catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        // Сортировка методом вставки
        for (int left = 0; left < array1.length; left++) {
            // Вытаскиваем значение элемента
            int value = array1[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array1[i]) {
                    array1[i + 1] = array1[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array1[i + 1] = value;
        }

        // Выводим на экран отсортированный массив
        System.out.println("Отсортированный массив:");
        for (int index = 0; index < array1.length; index++)
        {
            System.out.print(array1[index] + " ");
        }
    }
}