package JavaExercises.ArrayList;

// Question 11 :
// Write a Java program to search an element in a array list

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 34, 56, 78, 9, 13, 46, 79, 24, 17));

        System.out.println("Enter element to search : ");
        int toSearch = scan.nextInt();

        System.out.println(contains(list, toSearch) ? "ArrayList contains the given element . . ." : "ArrayList does not contains the given element . . .");
    }

    public static boolean contains(ArrayList<Integer> list, int toSearch) {
        for (int ele : list) {
            if (ele == toSearch) return true;
        }
        return false;
    }
}

/**
 * Output :
 * Enter element to search :
 * 50
 * ArrayList does not contains the given element . . .
 */
