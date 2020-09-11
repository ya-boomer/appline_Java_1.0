import java.io.*;

/**
 * Задача №18:  * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную. Количество строк после
 * перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class ReadWriteFile {
    private static String readString;

    public static void main(String[] args) throws IOException {

        // проверяем существует ли указанный файл и выводим содержимое в консоль
        System.out.println("Файл содержит " + getNumberLine() + " строк");
            getFileString();
            setFileString(getNumberLine());
    }

    public static int getNumberLine() throws IOException {
        int i = 0;
        {
            try (BufferedReader br = new BufferedReader(new FileReader("src/ReadWriteFile.txt"))) {
                while ((readString = br.readLine()) != null) {
                    i++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public static void getFileString() throws IOException {
        System.out.println("Файл имеет следущее содержимое:");
        try (BufferedReader br = new BufferedReader(new FileReader("src/ReadWriteFile.txt"))){
            while ((readString = br.readLine()) != null) {
                System.out.println(readString);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        }


    public static void setFileString(int lineCount) throws IOException {
        String writeString;
        try (FileWriter fw = new FileWriter("src/ReadWriteFile.txt")) {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Внимание! Информация будет перезаписана");
            for (int j = 0; j < lineCount; j++) {
                writeString = buf.readLine();
                writeString = writeString + System.lineSeparator();
                fw.write(writeString);
            }
        }
    }
}

