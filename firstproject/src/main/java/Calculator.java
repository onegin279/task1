package Calc;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble2();
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);

    }

    public static double getDouble(){
        System.out.println("Введите первое число: ");
        double num = 0;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        }
        return num;
    }
    public static double getDouble2(){
        System.out.println("Введите второе число: ");
        double num2 = 0;
        if(scanner.hasNextDouble()){
            num2 = scanner.nextDouble();
        }
        return num2;
    }

    public static char getOperation(){
        System.out.println("Выберите операцию (+, -, * ,/): ");
        char operation = 0;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation){
        double result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }
        return result;
    }
}