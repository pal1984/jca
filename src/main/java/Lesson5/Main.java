package Lesson5;

public class Main {

    public static void main(String[] args) {

        Workers[] arrWorkers = {

        new Workers("Иванов Иван", "Директор", "ivanov@mail.ru", "+79384800623", 100000, 46),
        new Workers("Петров Петр", "Зам директора", "petrov@mail.ru", "+79284810722", 80000, 39),
        new Workers("Васильева Елена", "Бухгалтер", "vasilyeva@mail.ru", "+79185911734", 60000, 42),
        new Workers("Павлова Анастасия", "Оператор", "pavlova@mail.ru", "+79883794532", 40000, 26),
        new Workers("Алексеев Алексей", "Логист", "alekseev@mail.ru", "+79003234573", 50000, 36),
        };

        for (Workers workers : arrWorkers) {
            if (workers.getAge() > 40) workers.displayInfo();

        }
    }
}
