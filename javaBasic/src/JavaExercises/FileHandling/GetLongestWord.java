package JavaExercises.FileHandling;

import java.io.*;
import java.util.Scanner;

// Question 9 :
// Write a Java program to find the longest word in a text file and write the words into a new text file.
public class GetLongestWord {
    public static void main(String[] args) {
        // Writing the file
        writeFile();

        // Getting longest word from the file
        try {
            getLongestWord();
        } catch (FileNotFoundException e) {
            System.out.println("File not found at the specified location");
        }
    }

    public static void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling\\LongestWord.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Write a Java program to find the longest word in a text file and write the words into a new text file");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getLongestWord() throws FileNotFoundException {
        String longestWord = "";
        Scanner scan = new Scanner(new File("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling\\LongestWord.txt"));

        while (scan.hasNext()) {
            String current = scan.next();
            longestWord = current.length() > longestWord.length() ? current : longestWord;
        }

        System.out.println("The longest word in file is : " + longestWord);
    }
}

/**
 * Output :
 * The longest word in file is : program
 */