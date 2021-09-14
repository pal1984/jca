package Lesson6;

public class Animal {

    protected String type;
    protected String name;
    protected static int maxRunDistance;
    protected static int maxSwimDistance;
    protected static int counter;

    public Animal() {
        counter++;
    }

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        this();
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.printf("%s %s run %d meters\n", type, name, distance);
            return true;
        }
        else System.out.printf("%s %s don't run %d meters\n", type, name, distance);
        return false;
    }

    public boolean swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.printf("%s %s swim %d meters\n", type, name, distance);
            return true;
        }
        else System.out.printf("%s %s don't swim %d meters\n", type, name, distance);
        return false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getMaxRunDistance() {
        return maxRunDistance;
    }

    public static void setMaxRunDistance(int maxRunDistance) {
        Animal.maxRunDistance = maxRunDistance;
    }

    public static int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public static void setMaxSwimDistance(int maxSwimDistance) {
        Animal.maxSwimDistance = maxSwimDistance;
    }

    public static int getCounter() {
        return counter;
    }


}
