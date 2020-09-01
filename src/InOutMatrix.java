/**
 * Задание №10: Ввод/вывод данных для матрицы
 * Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
 * где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

import java.util.Scanner;

public class InOutMatrix {
    public static void main(String[] args) {
        //Создаем матрицу, принимаем размерность матрицы от пользователя
        System.out.println("Введите размерность матрицы");
        Scanner in1 = new Scanner(System.in);
        int x = 0;
        int y = 0;
        try {
            x = in1.nextInt();
            y = in1.nextInt();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        int[][] array1 = new int[x][y];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                try {
                    array1[i][j] = in1.nextInt();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }
        }
        //Выводим на экран первую строку матрицы, помноженную на 3
        System.out.println("Первая строка матрицы, помноженная на 3");
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < y; j++){
                System.out.print(array1[i][j] * 3 + " ");
            }
        }

    }
}
