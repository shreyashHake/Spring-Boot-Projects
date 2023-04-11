package Task2;

public class University {
    public String college;
    public int found;
    public String city;
    public String state;
    public int nirfRank;
    public String entranceExam;

    public University(String college, int found, String city, String state, int nirfRank, String entranceExam) {
        this.college = college;
        this.found = found;
        this.city = city;
        this.state = state;
        this.nirfRank = nirfRank;
        this.entranceExam = entranceExam;
    }

    void getDetails() {
        System.out.println(college + " was found in " + found + ", and situated at " + city + ", \nwhich belongs to " + state + " state, one have to appear for " + entranceExam + " for addmission, its NIRF rank for 2022 is " + nirfRank + ".");
    }

    public static void main(String[] args) {
        // String college, int found, String city, String state, int nirfRank, String entranceExam

        University obj1 = new University("The Indian Institute of Technology Bombay (IIT Bombay)",
                1958, "Mumbai", "Maharashtra", 3, "JEE main and JEE advance");

        obj1.getDetails();
    }
}
