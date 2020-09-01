import java.util.Scanner;

/**
 * Задание №9: Ввод/вывод данных для массива
 * Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент
 * массива умножается на 2. Размер массива задается пользователем.
 */
public class DataArray {
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
        //Умножаем все элементы массива на 2
        System.out.println("Полученный массив, размерностью " + size + ", умноженный на 2");
        for (int i = 0;i < size; i++) {
            System.out.print(array1[i] * 2 + " ");
        }


    }
}
