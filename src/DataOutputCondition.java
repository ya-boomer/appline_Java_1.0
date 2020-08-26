import java.util.Scanner;

public class DataOutputCondition {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int X = 10;
        int Y = 20;
        int Z = 30;
        if (number == X || number == Y || number == Z)
        {
            System.out.println("Данное значение имеется в константах");
        }
        else
        {
            System.out.println("Такой константы нет!");
        }
    }
}
