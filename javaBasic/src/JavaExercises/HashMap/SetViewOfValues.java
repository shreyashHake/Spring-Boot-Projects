package JavaExercises.HashMap;
// Question 20 :
// Write a Java program to get a set view of the values contained in this map

import java.util.HashMap;

public class SetViewOfValues {
    public static void main(String[] args) {
        HashMap<String, Integer> price = new HashMap<String, Integer>() {
            {
                {
                    put("Orange Juice", 35);
                    put("Lemon Juice", 20);
                    put("Pineapple Juice", 45);
                    put("Banana Shake", 67);
                    put("Apple Juice", 34);
                    put("Mango Juice", 78);
                }
            }
        };

        System.out.println("Set View of Values : " + price.values());
    }
}

/**
 * Output :
 * Set View of Values : [45, 78, 20, 35, 34, 67]
 */
