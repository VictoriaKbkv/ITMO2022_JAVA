package Task10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {

        File inputFile = new File("Files\\Input.txt");
        File missingFile = new File("Files\\Other.txt");
        List<String> linesList = new ArrayList<String>();

        fileToStrings(inputFile, linesList);
        for (String line: linesList) {
            System.out.println(line);
        }
        System.out.println();

        fileToStrings(missingFile, linesList);

    }

    public static void fileToStrings(File file, List<String> list) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null){
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
