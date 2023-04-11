package Exception_Handling_Yt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * There can be only one 'finally' block
 * but we can have multiple 'catch' block
 * <p>
 * ** Even after return finally will execute . .
 */
public class FinallyBlock {
    public static void main(String[] args) throws IOException {
        FileInputStream file = null;

        try {
            file = new FileInputStream("C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\Exception_Handling_Yt\\finajlly.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {

//                try {
//                    file.close(); // we can also 'throws IOException'
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
                file.close();
            }
        }
    }
}
