package Calc;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) throws IOException {

        int num1 = (int) getInt();
        int num2 = (int) getInt2();
        char operation = getOperation();
        try {
        int result = (int) calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Недопустимая операция");
        }

    }

    public static int getInt() {
        System.out.println("Введите первое число: ");
        int num = 0;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        }
        return num;
    }

    public static int getInt2() {
        System.out.println("Введите второе число: ");
        int num2 = 0;
        if (scanner.hasNextInt()) {
            num2 = scanner.nextInt();
        }
        return num2;
    }

    public static char getOperation() {
        System.out.println("Выберите операцию (+, -, * ,/): ");
        char operation = 0;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }


    }
