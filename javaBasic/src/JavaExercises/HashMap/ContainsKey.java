package JavaExercises.HashMap;

import java.util.HashMap;
import java.util.Scanner;

// Question 17
// Write a Java program to test if a map contains a mapping for the specified key
public class ContainsKey {
    public static void main(String[] args) {
        HashMap<String, Integer> price = new HashMap<String, Integer>();

        price.put("Tea", 10);
        price.put("Pizza", 200);
        price.put("Coffee", 50);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item to check availability : ");

        System.out.println(price.containsKey(sc.nextLine()) ? "Item is available . . ." : "Item is not available . . .");
    }
}

/**
 * Output :
 * 1.
 * Enter item to check availability : Tea
 * Item is available . . .
 * <p>
 * 2.
 * Enter item to check availability : Juice
 * Item is not available . . .
 */