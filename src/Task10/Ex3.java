package Task10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {
        File outputFile = new File("Files\\Ex3Output.txt");
        File inputFile1 = new File("Files\\Input.txt");
        File inputFile2 = new File("Files\\AdditionalInput.txt");
        concatenateFiles(inputFile1, inputFile2, outputFile);
        concatenateFiles(inputFile1, inputFile2);
    }

    public static void concatenateFiles (File file1, File file2) {
        List<String> linesList = new ArrayList<>();
        Task10.Ex1.fileToStrings(file1, linesList);
        Task10.Ex1.fileToStrings(file2, linesList);
        File file = new File("Files\\concatenateFilesOutput.txt");
        for (String line : linesList) {
            Task10.Ex2.addStringToFile(line, file);
        }
    }

    public static void concatenateFiles (File file1, File file2, File outputFile) {
        List<String> linesList = new ArrayList<>();
        Task10.Ex1.fileToStrings(file1, linesList);
        Task10.Ex1.fileToStrings(file2, linesList);
        for (String line : linesList) {
            Task10.Ex2.addStringToFile(line, outputFile);
        }
    }
}
