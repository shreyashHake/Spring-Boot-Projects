package JavaExercises.ArrayList;

// Question 10 :
// Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;
import java.util.Scanner;

public class InsertAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you want to add : ");
        byte size = sc.nextByte();

        ArrayList<Integer> list = new ArrayList<>();
        while (size-- > 0) {
            list.add(sc.nextInt());
        }

        System.out.println("----------------------**--------------------------\nBefore inserting element at first : ");
        print(list);
        System.out.println("\n----------------------**--------------------------");

        System.out.println("Enter element to insert at first : ");
        list.add(0, sc.nextInt());

        System.out.println("\n----------------------**--------------------------\nAfter inserting element at first : ");
        print(list);
        System.out.println("\n----------------------**--------------------------");

    }

    public static void print(ArrayList<Integer> list) {
        for (Integer ele : list) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

/**
 * OutPut :
 * How many elements do you want to add : 3
 * 12 34 56
 * ----------------------**--------------------------
 * Before inserting element at first :
 * 12 34 56
 * <p>
 * ----------------------**--------------------------
 * Enter element to insert at first :
 * 89
 * <p>
 * ----------------------**--------------------------
 * After inserting element at first :
 * 89 12 34 56
 * <p>
 * ----------------------**--------------------------
 */