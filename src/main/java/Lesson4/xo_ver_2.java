package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class xo_ver_2 {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static char[][] field;

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAI;
    private static int roundCounter = 1;
    private static int winLength = 5;

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        while (true) {
            playRound();
            System.out.printf("SCORE: HUMAN    AI\n" +
                              "         %d      %d\n", scoreHuman, scoreAI);
            System.out.print("Wanna play again? Y or N >>>> ");
            if (!SCANNER.next().toLowerCase().equals("y")) {
                System.out.println("Good bye!");
                break;
            }
        }

    }

    private static void playRound() {
        System.out.printf("ROUND %d\n", roundCounter++);
        initField(9, 9);
        printField();

        while (true) {
            humanTurn();
            printField();
            if (checkGame(DOT_HUMAN)) break;
            aiTurn();
            printField();
            if (checkGame(DOT_AI)) break;
        }
    }

    private static boolean checkGame(char dot) {
        if (checkDraw()) return true;
        if (checkWin(dot, winLength)) {
            if (dot == DOT_HUMAN) {
                System.out.println("HUMAN WINS!!!");
                scoreHuman++;
            } else {
                System.out.println("AI WINS!!!");
                scoreAI++;
            }
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x, y;

        do {
            System.out.print("Please enter coordinates of your turn x & y split by whitespace >>>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));

        field[y][x] = DOT_HUMAN;
    }

    //***** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
    private static void aiTurn() {
        for (int i = 0; winLength - i > 2; i++) {
        if (scanField(DOT_AI, winLength - i)) return;        // проверка выигрыша компа
        if (scanField(DOT_HUMAN, winLength - i)) return;    // проверка выигрыша игрока на след ходу
        }
        aiTurnEasy();
    }


    private static void aiTurnEasy() {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(y, x));
        field[y][x] = DOT_AI;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("DRAW!!!");
        return true;
    }

    private static boolean scanField(char dot, int length) {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) {                // поставим фишку в каждую клетку поля по очереди
                    field[y][x] = dot;
                    if (checkWin(dot, length)) {
                        if (dot == DOT_AI) return true;    // если комп выигрывает, то оставляем
                        if (dot == DOT_HUMAN) {
                            field[y][x] = DOT_AI;            // Если выигрывает игрок ставим туда 0
                            return true;
                        }
                    }
                    field[y][x] = DOT_EMPTY;            // если никто ничего, то возвращаем как было
                }
            }
        }
        return false;
    }

    private static boolean checkWin(char dot, int length) {
        for (int y = 0; y < fieldSizeY; y++) {            // проверяем всё поле
            for (int x = 0; x < fieldSizeX; x++) {
                if (checkLine(x, y, 1, 0, length, dot)) return true;    // проверка  по +х
                if (checkLine(x, y, 1, 1, length, dot)) return true;    // проверка по диагонали +х +у
                if (checkLine(x, y, 0, 1, length, dot)) return true;    // проверка линию по +у
                if (checkLine(x, y, 1, -1, length, dot)) return true;    // проверка по диагонали +х -у
//                if (checkLine(i, j, -1, 0, length, dot)) return true;	// проверка  по +х
//                if (checkLine(i, j, -1, 1, length, dot)) return true;	// проверка по диагонали +х +у
//                if (checkLine(i, j, 0, -1, length, dot)) return true;	// проверка линию по +у
//                if (checkLine(i, j, -1, -1, length, dot)) return true;	// проверка по диагонали +х -у
            }
        }
        return false;
    }

    // проверка линии
    private static boolean checkLine(int x, int y, int incrementX, int incrementY, int len, char dot) {
        int endXLine = x + (len - 1) * incrementX;            // конец линии по Х
        int endYLine = y + (len - 1) * incrementY;            // конец по У
        if (!isCellValid(endYLine, endXLine)) return false;    // Выход линии за пределы
        for (int i = 0; i < len; i++) {                    // идем по линии
            if (field[y + i * incrementY][x + i * incrementX] != dot) return false;    // символы одинаковые?
        }
        return true;
    }

    //Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    //*Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
    //*** Попробовать сделать универсальную проверку, для произвольной длины последовательности
    // и произвольного размера поля
//    private static boolean checkWin(char dot) {
//        //hor
//        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
//        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
//        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
//
//        //ver
//        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
//        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
//        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
//
//        //diag
//        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
//        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;
//        return false;
//    }

    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void initField(int sizeX, int sizeY) {
        fieldSizeY = sizeY;
        fieldSizeX = sizeX;
        field = new char[sizeY][sizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i <= fieldSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + "  ");
//            }
//            System.out.println();
//        }
    }
}
