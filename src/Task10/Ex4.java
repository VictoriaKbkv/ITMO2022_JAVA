package Task10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {

        File file = new File("Files\\Input.txt");
        String symbol = "\\$";

        changeSymbols(file, symbol);

    }

    public static void changeSymbols (File file, String s) {
        File temp = new File("Files\\Temp.txt");
        List<String > list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null){
                list.add(line.replaceAll("[^a-zA-Z0-9]", s));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {

            for (String string : list) {
                writer.write(string);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
