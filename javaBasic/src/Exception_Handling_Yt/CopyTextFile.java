package Exception_Handling_Yt;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
    public static void main(String[] args) {
        File file = new File("./textFile.txt");
        File file2 = new File("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\Exception_Handling_Yt\\textFile2.txt");

        FileReader fileInputStream = null;
        FileWriter fileOutputStream = null;

        try {
            fileInputStream = new FileReader(file);
            fileOutputStream = new FileWriter(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            int i = 0;

            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }

        } catch (NullPointerException | IOException ep) {
            ep.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
