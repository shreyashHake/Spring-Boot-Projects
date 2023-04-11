package JavaExercises.HashMap;

import java.util.HashMap;
import java.util.Scanner;

// Question 22 :
// Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key

public class GetRequiredMapping2 {
    public static void main(String[] args) {
        HashMap<Integer, String> menu = new HashMap<>() {
            {
                put(35, "Orange Juice");
                put(20, "Lemon Juice");
                put(45, "Pineapple Juice");
                put(76, "Banana Shake");
                put(34, "Apple Juice");
                put(78, "Mango Juice");
            }
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the given key : ");
        int given = sc.nextInt();
        getKeyValueMapping(menu, given);
    }

    public static void getKeyValueMapping(HashMap<Integer, String> menu, int given) {
        int diff = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;

        for (int key : menu.keySet()) {
            int currentDiff = key - given;
            if (currentDiff < diff && currentDiff > -1) {
                res = key;
                diff = currentDiff;
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println("There is no such key . . ");
            return;
        }
        System.out.println("Least key greater than or equal to the given key : [" + res + " : " + menu.get(res) + "]");
    }
}

/**
 * Output :
 * 1.
 * Enter the given key : 31
 * Least key greater than or equal to the given key : [34 : Apple Juice]
 * <p>
 * 2.
 * Enter the given key : 45
 * Least key greater than or equal to the given key : [45 : Pineapple Juice]
 * <p>
 * 3.
 * Enter the given key : 91
 * There is no such key  . .
 */