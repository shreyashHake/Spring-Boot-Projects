package Exception_Handling_Yt;

public class TryCatchOnNewMethod {
    public static void main(String[] args) {
        TryCatchOnNewMethod obj = new TryCatchOnNewMethod();

        //1.
        // obj.divide1(); --> will give erro

        //2.
        try {
            obj.divide2();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        //3.
        obj.divide3();
    }

    public void divide1() {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);
    }

    public void divide2() {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);
    }

    public void divide3() {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
