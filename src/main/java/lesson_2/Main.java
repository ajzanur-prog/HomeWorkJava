package lesson_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSing();
        printColor();
        compareNumbers();

        System.out.println(checkSum(5, 4));

        checkNumber(20);

        System.out.println(isNegative(-19));

        printString("Привет", 2);

        System.out.println(isLeapYear(1900));

        changeArray();
        fillArray();
        multiArray();
        diagonalArray();


    }

    public static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a = 10;
        int b = -5;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <=20;

    }

    public static void checkNumber(int number) {

        if (number >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean isNegative(int number) {
        return number < 0;

    }

    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++){
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

    }

    public static void changeArray() {
        int[] array = {1,1,0,0,1,0,1,1,0,0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));

    }

    public static void fillArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));

    }

    public static void multiArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }

        System.out.println(Arrays.toString(array));

    }

    public static void diagonalArray() {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++){
            array[i][i] = 1;
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }

    }

}

