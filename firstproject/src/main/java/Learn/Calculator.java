package Learn;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    private double first;
    private double second;
    private IOperation operation;


    //первый вариант
    public Calculator(IOperation operation) {
        try {
            System.out.print("Введите первое число: ");
            this.first = scanner.nextInt();
            System.out.print("Введите второе число: ");
            this.second = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Введён недопустимый символ!!!");
            System.exit(0);

        }
        this.operation = operation;


    }


    // второй вариант
    /*
    public Calculator(IOperation operation) {
        do {
            System.out.print("Введите первое число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введён недопустимый символ!!!");
                scanner.next();
            }
            this.first = scanner.nextInt();
        } while (this.first <= 0);
        this.first = scanner.nextInt();


        this.operation = operation;


    }
    */


    public double calculate() {
        return operation.getResult(first, second);
    }

    public void printResult() {
        System.out.println(String.format("%.4f %s %.4f = %.4f", first, operation.getSign(), second, calculate()));
    }
}
