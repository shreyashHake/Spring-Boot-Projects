package Task1;

public class Intern {

    // About Company
    public static final String company = "Hitachi Vantara";
    public static final String address = "Magarpatta city, tower 7, Hadapsar, Pune, Maharashtra, India";

    // Personal details
    public int empId;
    public String name;
    public String emailId;
    public String username;
    public String position;
    public double salary;

    // Team details
    public String department;
    public String manager;
    public String techStack;

    // Constructor
    public Intern(int empId, String name, String emailId, String username, double salary, String position, String department, String manager, String techStack) {
        this.empId = empId;
        this.name = name;
        this.emailId = emailId;
        this.username = username;
        this.salary = salary;
        this.position = position;

        this.department = department;
        this.manager = manager;
        this.techStack = techStack;
    }

    void getCompany() {
        System.out.println("Name of company: " + company);
    }

    void getName() {
        System.out.println("Name of employee: " + name);
    }

    void getEmpid() {
        System.out.println("Id of employee: " + empId);
    }

    void getEmail() {
        System.out.println("Email of employee: " + emailId);
    }

    void getUsername() {
        System.out.println("Username of employee: " + username);
    }

    void getSalary() {
        System.out.println("Salary of employee: " + salary);
    }

    void getPosition() {
        System.out.println("Position of employee: " + position);
    }

    void getDepartment() {
        System.out.println("Department of employee: " + department);
    }

    void getManager() {
        System.out.println("Manager of employee: " + manager);
    }

    void getTechStack() {
        System.out.println("TechStack of employee: " + techStack);
    }

    void getAllDetails() {
        System.out.println("**---------- Intern Details ---------- **");
        System.out.println("Name of company: " + company);
        System.out.println("Name of employee: " + name);
        System.out.println("Id of employee: " + empId);
        System.out.println("Email of employee: " + emailId);
        System.out.println("Username of employee: " + username);
        System.out.println("Salary of employee: " + salary);
        System.out.println("Position of employee: " + position);
        System.out.println("Department of employee: " + department);
        System.out.println("Manager of employee: " + manager);
        System.out.println("TechStack of employee: " + techStack);
    }

    public static void main(String[] args) {

        Intern intern1 = new Intern(73758, "Shreyash Hake", "shreyash.hake@hitachi.com", "shake", 200000.00d, "Intern", "App Engineering", "Kiran", "Java + Angulalr");

//		intern1.getName();
//		intern1.getCompany();
//		intern1.getPosition();

        intern1.getAllDetails();

    }
}
