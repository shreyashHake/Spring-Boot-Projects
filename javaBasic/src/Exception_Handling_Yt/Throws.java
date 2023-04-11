package Exception_Handling_Yt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\Exception_Handling_Yt\\finally.txt");
    }

    void writeFile() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\Exception_Handling_Yt\\textFile.txt");
    }
}

public class Throws {

    public static void main(String[] args) {
        /**About throws :
         * The Java throws keyword is used to declare an exception.
         * It gives an information to the programmer that there may occur an exception.
         *
         * throw - inside the method
         * throws - with the method
         *
         * We can use throws keyword only with 'checked exception'
         *
         * if we don't handle the error from throws it will give unreported exception
         */

        ReadAndWrite raw = new ReadAndWrite();

        try {
            raw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            raw.writeFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Successfully executed");


    }
}
