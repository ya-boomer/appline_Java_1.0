import java.io.*;

/**
 * Задача №16: Выгрузка данных из файла на экран
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */
public class ReadFile {
    public static void main(String[] args) {
        String s;
        // проверяем существует ли указанный файл и выводим содержимое в консоль
        try (BufferedReader br = new BufferedReader(new FileReader("src/file.txt"))){
            System.out.println("Файл имеет следущее содержимое:");
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        // Метод finally не требуется, т.к. после вывода содержимого в консоль, файл закрывается
    }
}
