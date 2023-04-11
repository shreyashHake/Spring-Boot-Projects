package JavaExercises.LinkedList;

// Question 14
// Write a Java program to search an element in a linked list

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(12, 23, 34, 45, 56, 67, 78, 90));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search : ");

        System.out.println(contains(linkedList, sc.nextInt()) ? "Linked list contains the element . . ." :
                "Linked list does not contains the element . . ");
    }

    public static boolean contains(LinkedList<Integer> list, int toSearch) {
        for (Integer ele : list) {
            if (ele == toSearch) return true;
        }
        return false;
    }
}
/**
 * Output :
 * Enter the element to search : 34
 * Linked list contains the element . . .
 * <p>
 * Enter the element to search : 123
 * Linked list does not contains the element . .
 */