package Task10;

import java.io.*;

public class Ex2 {
    public static void main(String[] args) {

        addStringToFile("2.\tНаписать метод, который записывает в файл строку, переданную параметром.");

    }

    public static void addStringToFile (String line) {
        File file = new File("Files\\addStringToFileOutput");
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
            out.println(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addStringToFile (String line, File file) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
            out.println(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
