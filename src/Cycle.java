/**
 * Задача №8: Цикличный вывод данных на экран
 * Необходимо с помощью цикла вывести на экран числа от 1 до 50.
 */
public class Cycle {
    public static void main(String[] args) {
        //Цикл for
        for (int i = 1; i <= 50; i++)
        {
            System.out.println("i = " + i);
        }
        //Цикл while
        int j = 1;
        while (j <= 50){
            System.out.println("j = " + j);
            j++;
        }
    }
}
