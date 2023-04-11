package JavaExercises.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

// Question 13 :
// Write a Java program to insert an element into the linked list at the first position
public class InsertAtFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to add : ");
        int size = sc.nextInt();

        System.out.println("Enter the elements : ");
        LinkedList<Integer> linkedList = new LinkedList<>();

        while (size-- > 0) {
            linkedList.add(sc.nextInt());
        }

        System.out.println("Enter the elements add first : ");
        linkedList.addFirst(sc.nextInt());

        System.out.println("Now the linked List become : ");
        print(linkedList);
    }

    public static void print(LinkedList<Integer> linkedList) {
        for (Integer ele : linkedList) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

/**
 * Output :
 * Enter the number of elements to add : 3
 * Enter the elements :
 * 12 34 56
 * Enter the elements add first :
 * 89
 * Now the linked List become :
 * 89 12 34 56
 */
