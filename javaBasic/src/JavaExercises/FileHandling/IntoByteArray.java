package JavaExercises.FileHandling;

// Question 6 ;
// Write a Java program to read contents from a file into byte array.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IntoByteArray {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling\\demo.txt");

        byte[] fileContent = new byte[(int) file.length()];

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            fileInputStream.read(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File content: " + new String(fileContent));
    }
}

/**
 * Output :
 * File content: Hey there !!, the file is successfully read . . .
 */