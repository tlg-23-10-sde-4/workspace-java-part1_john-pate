package man.boogey;

/*
 * Boogeyman Identification Tool
 */

/**
 * JR: Very good result overall.
 * Demonstrates good understanding of program concepts, and all components work perfectly.
 *
 * Perhaps a few more business methods, but what you have here is good, and the
 * output messages are fun - clearly, you tested everything thoroughly to ensure this.
 *
 * Unsure why this class definition is named BoogeymanFinder, and not Boogeyman,
 * since it's clearly modeling a boogeyman itself, not a "finder" of them.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been excellent, keep it up.
 *
 * Class names, package names, and overall structure are correct.
 */
public class BoogeymanFinder {
    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_HEIGHT = 1;
    public static final int MAX_HEIGHT = 100;
    private static int monsterCount = 0;
    public static int getMonsterCount() {
        return monsterCount;
    }

    // Properties or attributes - in Java, we call these "instance variables" or "fields"
    private String name = "the Boogeyman";
    private int height=6;
    private String appearance= "monstrous";
    private MonsterBehavior behavior = MonsterBehavior.FRIGHTEN;    // constraints: present/infinitive verbs required
    private String target= "co-eds";

    // JR: you didn't have to implement this (as in the labs), unless you find it interesting
    public BoogeymanFinder() {
        monsterCount++;
    }

    public BoogeymanFinder(int height) {
        this();
        setHeight(height);
    }

    public BoogeymanFinder(int height, String appearance) {
        this(height);
        setAppearance(appearance);
    }

    public BoogeymanFinder(int height, String appearance, String name) {
        this(height, appearance);
        setName(name);
    }

    public BoogeymanFinder(int height, String appearance, String name, MonsterBehavior behavior) {
        this (height, appearance, name);
        setBehavior(behavior);
    }

    public BoogeymanFinder(int height, String appearance, String name, MonsterBehavior behavior, String target) {
        this (height, appearance, name, behavior);
        setTarget(target);
    }

    // Business "action" methods

    // JR: generally better to call your own getters instead of direct field access
    public void description() {
        System.out.println(name + " is often described as " + appearance + " and is roughly " + height + " feet tall.");
    }

    // JR: this is the only business ("action") method in here
    public void terrorize() {
        System.out.println(name + " will typically " + behavior + " " + target + ".");
    }

    // Functions of operations - in Java, we call these "methods"
    public MonsterBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(MonsterBehavior behavior) {
        this.behavior = behavior;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= MIN_HEIGHT && height <= MAX_HEIGHT) {
            this.height = height;
        }
        else {
            System.out.println("Invalid height(in feet): " + height + ". " + "Must be between: " + MIN_HEIGHT + " and " +
                    MAX_HEIGHT + ", please try again.");
        }
    }

    // JR: generally better to call your own getters instead of direct field access
    // You do it for getHeight() and getAppearance(), but not the others.
    public String toString() {
        return "Your current Boogeyman: height(in feet)= " + getHeight() + ", appearance=" + getAppearance() + ", name="
                + name + ", behavior=" + behavior + ", target=" + target;

    }

}