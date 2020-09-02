import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Задача №15: Сортировка данных в массиве
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Использовать пузырьковый метод сортировки.
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Введите числа массива");
        System.out.println("Внимание! Чтобы остановить ввод, необходимо ввести любой символ, отличный от цифры");
        Scanner in1 = new Scanner(System.in);
        ArrayList <Integer> arrayList1 = new ArrayList<Integer>();
        while (in1.hasNextInt()) {
            int x = in1.nextInt();
            arrayList1.add(x);
        }
        for (int i = arrayList1.size() -1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arrayList1.get(j) > arrayList1.get(j + 1))
                {
                    int tmp = arrayList1.get(j);
                    arrayList1.set(j, arrayList1.get(j + 1));
                    arrayList1.set(j + 1,tmp);
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (int index = 0; index < arrayList1.size(); index++)
        {
            System.out.print(arrayList1.get(index) + " ");
        }
    }
}
