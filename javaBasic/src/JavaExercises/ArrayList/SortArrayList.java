package JavaExercises.ArrayList;

// Question 12
// Write a Java program to search an element in a array list

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of List : ");
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements : ");

        while (size-- > 0) {
            list.add(sc.nextInt());
        }

        System.out.println("-----------------**---------------------");
        System.out.print("Before sorting : ");
        print(list);
        System.out.println("\n-----------------**---------------------");
        Collections.sort(list);
        System.out.print("After sorting : ");
        print(list);
    }

    public static void print(ArrayList<Integer> list) {
        for (int ele : list) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}

/**
 * Output :
 * Enter the size of List :
 * 4
 * Enter the elements :
 * 78 65 43 21
 * -----------------**---------------------
 * Before sorting : 78 65 43 21
 * <p>
 * -----------------**---------------------
 * After sorting : 21 43 65 78
 */