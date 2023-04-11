package Exception_Handling_Yt;

public class TryCatch {
    public static void main(String[] args) {
        try { // risky code
            int a = 100, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) { // Handling code
            System.out.println("*******************************");
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println("*******************************");
            e.printStackTrace();
        }
    }
}
