package Exception_Handling_Yt;

public class MethodsToPrintException {
    public static void main(String[] args) {
        try { // risky code
            int a = 100, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) { // Handling code
            /**
             * Exception class name - e (Arithmetic Exception)
             * Description - d (/ by zero)
             * line num - n (line number ; 7)
             */

            //1.
            e.printStackTrace(); // gives e + d + n

            //2.
            System.out.println(e); // gives e + d

            //3.
            System.out.println(e); // gives e + d

            //4.
            System.out.println(e.getMessage()); // gives d
        }
    }
}
