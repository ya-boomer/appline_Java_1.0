import java.io.*;

/**
 * Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
 * Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
 * Пользователь при тестировании программы по правилу черного ящика должен понимать,
 * какой принцип остановки записи в файл он должен подать.
 */
public class WriteFile {
    public static void main(String[] args) {
        //Считываем информацию от пользователя
        String str;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Чтобы остановить запись в файл введите 'стоп' или 'stop' в любом регистре букв");
        // Проверяем наличие файла, в который будет записываться информация, если его нет, то будет создан
        try (FileWriter fw = new FileWriter("src/WriteFile.txt")){
            System.out.println("Внимание! Если файл уже существовал, то информация будет перезаписана");
            System.out.println("Введите информацию, которую надо записать в файл:");
            do {
                str = buf.readLine();
                //Проверяем стоп-слово, его можно ввести в любом регистре букв
                if (str.toLowerCase().compareTo("stop") == 0 || str.toLowerCase().compareTo("стоп") == 0) break;
                //Добавляем символ переноса строки
                str = str + "\r\n";
                fw.write(str);
            }
            while (str.compareTo("stop") != 0 || str.compareTo("стоп") !=0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
