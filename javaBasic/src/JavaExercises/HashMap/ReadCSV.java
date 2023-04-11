package JavaExercises.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

// Question 16 :
// Write a program to read the content from a CSV file with Empid , Emp Name and push the same into a hashmap
public class ReadCSV {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\shhake\\IdeaProjects\\javaBasic\\src\\JavaExercises\\HashMap\\empDetails.csv";

        HashMap<String, String> empDetails = new HashMap<>();

        try {
            boolean firstLine = true;
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));

            while ((line = bufferedReader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                } else {
                    String[] data = line.split(",");
                    empDetails.put(data[0], data[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Map : " + empDetails);
    }
}

/**
 * Question :
 * Map : {1=Tanmay, 2=Harshal , 3=Vrushant, 4=Sheyash, 5=Gopal, 6=Ganesh}
 */