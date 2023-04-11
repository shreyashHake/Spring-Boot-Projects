package Task3.com.company;

public class User implements Phone {

    String name;
    int mp;
    String processor;
    String IMEI;
    String coe;

    User(String name, int mp, String processor, String IMEI, String coe) {
        this.name = name;
        this.mp = mp;
        this.processor = processor;
        this.IMEI = IMEI;
        this.coe = coe;
    }

    public void apps() {
        System.out.println("Phone has following apps : 1. Instagram  2. Camera  3. Setting  4. File manager");
    }

    public void camera() {
        System.out.println("Phone has camera of " + mp + " MP with 'Face Id'");
    }

    public void name() {
        System.out.println("Phone name is '" + name + "'");
    }

    public void processor() {
        System.out.println("Phone is powered by '" + processor + "' chip");
    }

    public void IMEI() {
        System.out.println("IMEI number is " + IMEI);
    }

    public void countryOfOrigin() {
        System.out.println("Phone is manufactured in '" + coe + "'");
    }

    public static void main(String[] args) {

        // String name, int mp, String processor, String IMEI, String coe
        User phone1 = new User("iPhone 11", 12, "A13 Bionic", "48126989", "USA");

        phone1.apps();
        phone1.camera();
    }
}
