package JavaExercises.ExceptionHandling;

//** Question 1 :
// Write a java program using multiple catch blocks.
// Create a class CatchExercise inside the try block declare an array a[] and initialize with value a[5] =30/5;
// In each catch block show Arithmetic exception and ArrayIndexOutOfBoundsException. */
public class CatchExercise {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];

            try {
                a[5] = 30 / 5;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound exception occurred");
            }

            a[2] = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }


        System.out.println("Will always execute . . .");
    }
}

/**
 * Output :
 * Array index out of bound exception occurred
 * Arithmetic Exception occurred
 * Will always execute . . .
 */