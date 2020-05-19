package Homework6;

import java.util.Scanner;

public class ArrayOperations {

    public static final int ELEMENT_NOT_FOUND = -1;

    public static boolean isProgramRunning = true;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете броя на числата, които ще въвеждате:");
        int arrayLength = scanner.nextInt();

        System.out.println("Въведете числата, от които ще е съставен масива: ");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();

            if (array[i] >= 1 && array[i] <= 100) {
                continue;
            } else i--;
            System.out.println("Невалидно число! Числата трябва да бъдат в интервала от 1 до 100!");
        }

        while (isProgramRunning) {
            Menu(array, scanner);
        }

    }

    private static void Menu(int[] array, Scanner scanner) {
        displayMenu();
        System.out.println("Въведете номера на процеса, който искате да бъде изпълнен: ");
        byte decision = scanner.nextByte();
        switch (decision) {
            case 1:
                menuNumbers();
                break;
            case 2:
                menuWords();
                break;
            case 3:
                isProgramRunning = false;
                break;
            default:
                System.out.println("Невалидна опция! Опитайте отново!");
                displayMenu();

        }
    }


    private static void displayMenu() {
        System.out.println("[1]Работа с числа\n" +
                "[2]Работа с думи\n" +
                "[3]Изход от програмата\n");
    }


    private static void menuNumbers() {
        System.out.println("[1] Извеждане само на простите числа от масива:\n" +
                "[2] Извеждане на най-често срещан елемент в масива: \n" +
                "[3] Извеждане на максимална редица от нарастващи елементи в масива: \n" +
                "[4] Извеждане на максимална редица от намаляващи елементи в масива: \n" +
                "[5] Извеждане на максимална редица от еднакви елементи в масива: \n" +
                "[6] Извеждане на последователност от числа от масива, които имат сума равна на число, генерирано на случаен принцип \n" +
                "[7] Връщане назад към основното меню:");
    }

    private static void menuWords() {
        System.out.println("[1] Обърнете буквите на думите от масива наобратно и ги визуализирайте в конзолата:\n" +
                "[2] Изведете броя на повтарящите се символи за всяка една  от думите в масива: \n" +
                "[3] Изведете броя на символите за всяка една от думите в масива: \n" +
                "[4] Изведете броя на повтарящите се думи от масива: \n" +
                "[5] Връщане назад към основното меню");
    }


    private static void Menu1(int[] array, Scanner scanner) {
        menuNumbers();
        System.out.println("Въведете номера на процеса, който искате да бъде изпълнен: ");
        byte decision = scanner.nextByte();
        switch (decision) {
            case 1:
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                isProgramRunning = false;
                break;
            default:
                System.out.println("Невалидна опция! Опитайте отново!");
                Menu1(array, scanner);
        }
    }

}