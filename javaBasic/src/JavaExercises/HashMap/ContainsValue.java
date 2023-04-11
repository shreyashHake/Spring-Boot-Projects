package JavaExercises.HashMap;

import java.util.HashMap;
import java.util.Scanner;

// Question 18 :
// Write a Java program to test if a map contains a mapping for the specified value
public class ContainsValue {
    public static void main(String[] args) {
        HashMap<String, Integer> price = new HashMap<String, Integer>();

        price.put("Tea", 10);
        price.put("Pizza", 200);
        price.put("Coffee", 50);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price : ");

        System.out.println(price.containsValue(sc.nextInt()) ? "Item with this price is available . . ." : "Item with this price is not available . . .");
    }
}

/**
 * Output :
 * 1.
 * Enter price : 10
 * Item with this price is available . . .
 * <p>
 * 2.
 * Enter price : 23
 * Item with this price is not available . . .
 */