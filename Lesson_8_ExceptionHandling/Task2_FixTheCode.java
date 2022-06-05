package Lesson_8_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2_FixTheCode {

    private static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }

    protected static void closeFileWriter(FileWriter fileWriter) throws IOException {
        fileWriter.close();
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            String filePath = scanner.nextLine();
            int howManyTimesToPrintTheTextToFile = scanner.nextInt();
            String textToAdd = scanner.nextLine();
            printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
        } catch (IOException e) {
            System.out.println("Your file has not been found, please enter correct file path");
            e.printStackTrace();
        }

    }
}
