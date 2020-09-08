import java.io.*;

/**
 * Задача №18:  * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную. Количество строк после
 * перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class ReadWriteFile {
    private static String readString;
    private static String writeString;
    private static BufferedReader br;
//    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    {
        try (BufferedReader br = new BufferedReader(new FileReader("src/eadWriteFile.txt"))) {
           // br = new BufferedReader(new FileReader("src/ReadWriteFile.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {


        // проверяем существует ли указанный файл и выводим содержимое в консоль

            getNumberLine(readString);
            getFileString(readString);
            setFileString(getNumberLine(readString), writeString);
    }

    public static int getNumberLine(String readString) throws IOException {
        int i = 1;

        while ((readString = br.readLine()) != null) {
            i++;
        }
        System.out.println("Файл содержит " + (i) + " строк");
        return i;
    }

    public static void getFileString(String readString) throws IOException {

        System.out.println("Файл имеет следущее содержимое:");
        while ((readString = br.readLine()) != null) {
            System.out.println(readString);
        }
    }

    public static void setFileString(int i, String writeString) throws IOException {
        FileWriter fw = new FileWriter("src/ReadWriteFile.txt");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        writeString = buf.readLine();
        System.out.println("Внимание! Информация будет перезаписана");
        for (int j = 0; j < i; j++) {
            writeString = writeString + "\r\n";
            fw.write(writeString);
        }
    }
}

