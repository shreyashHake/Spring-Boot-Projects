package JavaExercises.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

// Question 15 :
// Write a Java program to sort a given Linked list.
public class SortLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Linked List : ");
        int size = sc.nextInt();

        System.out.print("Enter the elements : ");
        LinkedList<Integer> linkedList = new LinkedList<>();

        while (size-- > 0) {
            linkedList.add(sc.nextInt());
        }

        System.out.print("Before sort : ");
        print(linkedList);

        Collections.sort(linkedList);

        System.out.print("After sort : ");
        print(linkedList);
    }

    public static void print(LinkedList<Integer> linkedList) {
        for (int ele : linkedList) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

/**
 * Output :
 * Enter the size of Linked List : 4
 * Enter the elements : 12 3 -34 56
 * Before sort : 12 3 -34 56
 * After sort : -34 3 12 56
 */