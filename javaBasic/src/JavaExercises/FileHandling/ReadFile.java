package JavaExercises.FileHandling;

import java.io.FileReader;
import java.io.IOException;

//** Question 2 :
// Write a Java Program to Read a file with proper exception handling including the finally block.
public class ReadFile {
    public static void main(String[] args) {
        try {

            FileReader read = new FileReader("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling\\demo.txt");

            int itr = read.read();

            while (itr != -1) {
                System.out.print((char) itr);
                itr = read.read();
            }

        } catch (IOException e) {
            System.out.println("File not found exception occurred . . .");
        } finally {
            System.out.println("\n \nfinally will always execute . . . ");
        }
    }
}

/**
 * Output :
 * Hey there !!, the file is successfully read . . .
 * <p>
 * finally will always execute . . .
 */