package JavaExercises.FileHandling;

// Questions 8 :
// Write a Java program to write and read a plain text file

import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        try {

            FileWriter fileWriter = new FileWriter("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling\\plainFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hi I am Shreyash Hake ^-^ !");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling\\plainFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Output :
 * Hi I am Shreyash Hake ^-^ !
 * Plain file (plainFile.txt):
 * Hi I am Shreyash Hake ^-^ !
 * Plain file (plainFile.txt):
 * Hi I am Shreyash Hake ^-^ !
 */

/** Plain file (plainFile.txt):
 *  Hi I am Shreyash Hake ^-^ !
 */