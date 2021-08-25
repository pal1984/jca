package Lesson1;

public class Intro {

    public static void main(String[] args) {

        byte xs = 127;
        short s = 16000;
        int m = 1565412165;
        long l = 516451511L;
        float fl = 3.14f;
        double dbl = 29.85;
        char symbol = '\u1234';
        boolean logic = true;

        res(2.0f, 4.0f, 6.0f, 8.0f);
        range(5, 7);
        posOrNeg(-3);
        checkNumber(10);
        name("Александр");
        checkYear();

    }

    public static float res(float a, float b, float c, float d) {

        return a * (b + (c / d));

    }

    public static boolean range(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void posOrNeg(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " положительное!");
        }
        else {
            System.out.println("Число " + x + " отрицательное!");
        }
    }

    public static boolean checkNumber(int x) {
        if (x < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void name(String name){

        System.out.println("Привет, " + name + "!");
    }

    public static void checkYear() {

        int x = 1984;
        if (x % 4 == 0 && x % 100 != 0 && x % 400 == 0){

            System.out.println(x + " год - високосный");
        }
        else {

            System.out.println(x + " год - не високосный");
        }
    }

}
