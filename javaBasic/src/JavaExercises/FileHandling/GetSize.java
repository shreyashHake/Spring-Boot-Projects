package JavaExercises.FileHandling;

// Question 5 :
// Write a Java program to get file size in bytes, kb, mb

import java.io.File;

public class GetSize {
    public static void main(String[] args) {

        File files = new File("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\FileHandling");

        try {
            String[] listOfFiles = files.list();
            for (String file : listOfFiles) {

                long fileSize = file.length();
                double fileInKb = fileSize / 1024.0;
                double fileInMb = fileInKb / 1024.0;

                System.out.println("\nFile name is : " + file);
                System.out.println("File size is : \n" + fileSize + " Bytes\n" + fileInKb + " KB \n" + fileInMb + " MB \n");
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
 * File name is : demo.txt
 * File size is :
 * 8 Bytes
 * 0.0078125 KB
 * 7.62939453125E-6 MB
 * <p>
 * <p>
 * File name is : GetDirectory.java
 * File size is :
 * 17 Bytes
 * 0.0166015625 KB
 * 1.621246337890625E-5 MB
 * <p>
 * <p>
 * File name is : GetLongestWord.java
 * File size is :
 * 19 Bytes
 * 0.0185546875 KB
 * 1.811981201171875E-5 MB
 * <p>
 * <p>
 * File name is : GetSize.java
 * File size is :
 * 12 Bytes
 * 0.01171875 KB
 * 1.1444091796875E-5 MB
 * <p>
 * <p>
 * File name is : IntoByteArray.java
 * File size is :
 * 18 Bytes
 * 0.017578125 KB
 * 1.71661376953125E-5 MB
 * <p>
 * <p>
 * File name is : LongestWord.txt
 * File size is :
 * 15 Bytes
 * 0.0146484375 KB
 * 1.430511474609375E-5 MB
 * <p>
 * <p>
 * File name is : multipleLine.txt
 * File size is :
 * 16 Bytes
 * 0.015625 KB
 * 1.52587890625E-5 MB
 * <p>
 * <p>
 * File name is : plainFile.txt
 * File size is :
 * 13 Bytes
 * 0.0126953125 KB
 * 1.239776611328125E-5 MB
 * <p>
 * <p>
 * File name is : ReadAndWriteFile.java
 * File size is :
 * 21 Bytes
 * 0.0205078125 KB
 * 2.002716064453125E-5 MB
 * <p>
 * <p>
 * File name is : ReadFile.java
 * File size is :
 * 13 Bytes
 * 0.0126953125 KB
 * 1.239776611328125E-5 MB
 * <p>
 * <p>
 * File name is : ReadLineByLine.java
 * File size is :
 * 19 Bytes
 * 0.0185546875 KB
 * 1.811981201171875E-5 MB
 */