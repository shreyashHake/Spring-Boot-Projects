package Exception_Handling_Yt;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

public class Throw {
    public static void main(String[] args) {
        /**
         * Syntax of ;
         * throw new ExceptionClassName("Adrak-lasan");
         *
         * throw keyword is used for custom errors
         *
         * create only unchecked exception instead of checked exception . .
         *
         *
         * throw creates the exception object () instead of the method in which exception occurred
         * but it will not handle it.
         *
         * throw send the created exception object to default exception handler of JVM
         * -as exception is not handled by the program so we need to hanlde it using try-catch
         *
         * throw : terminates the program abnormally
         *
         * we cannot write any statement after throw statement
         */

        System.out.println("Enter the age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("You can not vote");
            } else {
                System.out.println("Voted successfully !!");
            }
        } catch (YoungerAgeException e) {
            e.printStackTrace();
        }

        System.out.println("Voting completed");
    }
}
