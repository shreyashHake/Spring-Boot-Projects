package Task2;

public class Pokemon {

    public String name;
    public String type;
    public boolean multiType;
    public int generation;
    public String region;
    public String stats;
    public double winRatio;

    public Pokemon(String name, String type, boolean multiType, int generation, String region, String stats, double winRation) {
        this.name = name;
        this.type = type;

        this.multiType = multiType;
        this.generation = generation;
        this.region = region;

        this.stats = stats;
        this.winRatio = winRatio;
    }

    void getName() {
        System.out.println("You choose " + name + " ! ! . . ");
    }

    void getType() {
        System.out.println(name + " has " + type + " typing.");
    }

    void getMultitype() {
        System.out.println(multiType ? "Your pokemon has multityping." : "Your pokemon dosen't has multityping");
    }

    void getGeneration() {
        System.out.println(name + " is from generation " + generation);
    }

    void getRegion() {
        System.out.println(name + " is from " + region + " region");
    }

    void getStats() {
        System.out.println(name + " has following stats: " + stats);
    }

    void getWinRatio() {
        System.out.println(name + " has win raion of " + winRatio);
    }

    void getDetails() {

        System.out.println("\n** ---------- Pokemon ---------- **\n");

        System.out.println("You choose " + name + " ! ! . . ");

        System.out.println(name + " has " + type + " typing.");

        System.out.println(multiType ? "Your pokemon has multityping." : "Your pokemon dosen't has multityping");

        System.out.println(name + " is from generation " + generation);

        System.out.println(name + " is from " + region + " region");

        System.out.println(name + " has following stats: " + stats);

        System.out.println(name + " has win raion of " + winRatio);
    }

    public static void main(String[] args) {
        //String name, String type, boolean multiType, int generation, String region, String stats, double winRatio


        Pokemon pokemon1 = new Pokemon("Lucario", "Fighting and Steel", true, 4, "Sinnoh", "92:95", 80);
        pokemon1.getDetails();

        Pokemon pokmeon2 = new Pokemon("Greninja", "Dark and Water", true, 6, "Kalos", "91:94", 76);
        pokmeon2.getDetails();
    }
}
