package Lesson1;

public class Arrays {
    public static void main(String[] args) {

        int[] change = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < change.length; i++) {
            if (change[i] == 0) {
                change[i] = 1;
            }
            else if (change[i] == 1) {
                change[i] = 0;
            }
            System.out.print(change[i] + " ");
        }

        System.out.println();

        int[] plusThree = new int[8];
        for (int i = 0; i < 8; i++) {
            plusThree[i] = i * 3;
            System.out.print(plusThree[i] + " ");
        }

        System.out.println();

        int[] lowerSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < change.length; i++) {
            if (lowerSix[i] < 6) {
                lowerSix[i] *= 2;
            }
            System.out.print(lowerSix[i] + " ");
        }

        System.out.println();

        int[] maxMin = {10, 50, 30, 20, 110, 40, 80, 90};
        int max = maxMin[0];
        int min = maxMin[0];
        for (int i = 1; i < maxMin.length; i++) {
            if (maxMin[i] > max) {
                max = maxMin[i];
            }
            if (maxMin[i] < min) {
                min = maxMin[i];
            }
            }
            System.out.println("Максимальное число " + max);
            System.out.println("Минимальное число " + min);

            balance();

    }
    // Почему то здесь возвращает true, а когда меняешь элемент массива,
    // который изменяет баланс, то false не возвращается.
    public static boolean balance () {
        int[] arr = {1, 2, 3, 4, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            System.out.println(false);
        }
        sum /= 2;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            left += i;
            if (left == sum) {
                System.out.println(true);
                }
            if (left > sum) {
                System.out.println(false);
                }
            }
        return false; // Метод просил что-то вернуть, написал так. Правильно или нет? И почему?
        }

        // Задание со смещением не понял совсем. Можно пример с комментариями?
        // И какая практическая польза от этих смещений может быть?
    }
// Когда коммитил в гит, он написал 2 предупреждения:
//Warning:(44, 17) Condition 'maxMin[i] < min' is always 'false'
//Warning:(59, 9) 'for' loop replaceable with enhanced 'for'
//Что это значит?

