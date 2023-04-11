package JavaExercises.FileHandling;

// Question 4 :
// Write a Java program to get a list of all file/directory names from the given input directory

import java.io.File;

public class GetDirectory {
    public static void main(String[] args) {

        File files = new File("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling");

        try {
            String[] listOfFiles = files.list();
            for (String file : listOfFiles) {
                System.out.println(file);
            }
        } catch (Error e) {
            if (!files.exists()) {
                System.out.println("Directory does not exists");
            }
            if (!files.isDirectory()) {
                System.out.println("The path is not a directory");
            }
        }
    }
}

/**
 * Output :
 * demo.txt
 * GetDirectory.java
 * GetLongestWord.java
 * GetSize.java
 * IntoByteArray.java
 * LongestWord.txt
 * multipleLine.txt
 * plainFile.txt
 * ReadAndWriteFile.java
 * ReadFile.java
 * ReadLineByLine.java
 */