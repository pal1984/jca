package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        System.out.println("\"Игра \"Угадай число за 3 попытки!\"");
        System.out.println("=====================================");

        Scanner scanner = new Scanner(System.in);

        int inputNumber;
        Random random = new Random();
        int number = random.nextInt(9);
        int tries = 0;
        int newGame;

        do {
            tries++;
            System.out.println("Введите число от 0 до 9:");
            inputNumber = scanner.nextInt();
            if (inputNumber > number) {
                System.out.println("Загаданное число меньше!");
            }
            else if (inputNumber < number) {
                System.out.println("Загаданное число больше");
            }
            else
            {System.out.println("Вы угадали!");
                break;
            }

        }
        while (tries < 3); //Только этот цикл завершает программу
        System.out.println("Начать заново?");
        System.out.println("1 - Да / 0 - Нет");
        newGame = (int) scanner.nextInt();

        switch (newGame) {
            case 1:
                tries = 0; //Как запустить игру заново?
                break;
            case 0:
                break;
            default:
                System.out.println("Нераспознанная команда!");

        }

        scanner.close();
    }



}
