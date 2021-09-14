package Lesson6;

public class Cat extends Animal{

    private static int counter;

    public Cat(String name, int maxRunDistance, int maxSwimDistance) {
        super("Cat", name, maxRunDistance, maxSwimDistance);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
