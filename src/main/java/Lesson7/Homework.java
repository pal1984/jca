package Lesson7;

public class Homework {
    public static void main(String[] args) {
        catsAndBowls();

    }

    private static void catsAndBowls() {
        Cat[] cats = {
                new Cat("Murzik", 10),
                new Cat("Barsik", 15),
                new Cat("Vaska", 40)
        };

        Bowl bowl = new Bowl(0);
        bowl.addFoodInBowl(60);

        for (Cat cat : cats) {                   // Такой вопрос: у нас в консоли сначала печатается декриз тарелки,
            cat.eat(bowl);                       // а только потом кот ест. Как поменять местами эти действия, чтобы логичнее было?
        }

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
