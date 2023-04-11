package JavaExercises.FileHandling;

// Question 7 :
// Write a Java program to read a file content line by line.

import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
    public static void main(String[] args) {
        try {

            FileReader read = new FileReader("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling\\multipleLine.txt");

            int itr = read.read();

            while (itr != -1) {
                System.out.print((char) itr); // Exercise
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
 * Line 1
 * <p>
 * Line 2
 * <p>
 * Line 3
 * <p>
 * Line 4
 * <p>
 * finally will always excecute . . .
 */
