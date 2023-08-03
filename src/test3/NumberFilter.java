package test3;

import java.io.*;
import java.nio.file.Path;

public class NumberFilter {

    public static void main(String[] args) {
        File file = Path.of("resorces", "test.txt").toFile();
        File file2 = Path.of("resorces", "result.txt").toFile();


        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             FileWriter writer = new FileWriter(file2)) {

            int character;
            while ((character = reader.read()) != -1) {
                if (Character.isDigit((char) character)) {
                    writer.write(character);
                }
            }

            System.out.println("Файл успешно преобразован.");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла: " + e.getMessage());

        }
    }
}
