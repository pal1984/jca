package Lesson6;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Peach", 200, 0),
                new Cat("Murzik", 100, 0),
                new Dog("Graf", 500, 100),
                new Dog("Tuzik", 300, 50),
        };

        for (Animal animal : animals) {
            animal.run(100);
            animal.swim(50);
            animal.run(200);
            animal.swim(100);
            animal.run(300);
            animal.swim(150);
        }

        System.out.println("Creation of " + Cat.getCounter() + " cats");
        System.out.println("Creation of " + Dog.getCounter() + " dogs");
        System.out.println("Creation of " + Animal.getCounter() + " animals");
    }

}
