/*
Напиши программу, которая считывает из консоли имя текстового файла, далее читает строки из этого файла (используй метод readAllLines(Path) класса Files) и выводит их на экран через одну, начиная с первой.

Требования:
Программа должна считать из консоли путь к файлу.
Программа должна вывести в консоли содержимое файла согласно условию.
Для чтения строк из файла нужно использовать метод readAllLines(Path) класса Files.
Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.

 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //scanner
        Scanner scanner = new Scanner(System.in);
        //считываем имя файла и читаем строки
        List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));
        //цикл, выводящий строки
        for (int i = 0; i < lines.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(lines.get(i));
            }
        }
    }
}

