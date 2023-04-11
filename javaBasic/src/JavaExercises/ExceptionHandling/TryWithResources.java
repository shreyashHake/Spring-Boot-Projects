package JavaExercises.ExceptionHandling;

//** Question 3 :
// Write a Java program to leverage “try-with-resources” in Exception Handling

import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try {

            FileReader read = new FileReader("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExcersice\\demo.txt");

            int itr = read.read();

            while (itr != -1) {
                System.out.print((char) itr);
                itr = read.read();
            }

        } catch (IOException e) {
            System.out.println("File not found exception occurred . . .");
        }
    }
}

/**
 * Output :
 * Hey there !!, the file is successfully read . . .
 */