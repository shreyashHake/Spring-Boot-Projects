package JavaExercises.HashMap;

// Question 19 :
// Write a Java program to get a set view of the keys contained in this map

import java.util.HashMap;

public class SetViewOfKeys {
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
        System.out.println("Set View of keys : " + price.keySet());
    }
}

/**
 * Output :
 * Set View of keys : [Pineapple Juice, Mango Juice, Lemon Juice, Orange Juice, Apple Juice, Banana Shake]
 */