/**
* @author onegin
 * @see #// STOPSHIP: 03.12.17
 * @see java.lang.System
 */

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект scaner
        System.out.println("Введите первое число:");
        double i = scanner.nextDouble(); //Записываем введеное число в переменную i
        System.out.println("Введите второе число:");
        double j = scanner.nextDouble(); //Записываем введеное число в переменную j
        System.out.println("Выберите операцию (+, -, * ,/):");
        String z = scanner.next(); //Записываем операцию в переменную z

        if (z.equals("+")) {
            System.out.print("Сумма чисел = ");//Выводим форматированную сумму переменных
            System.out.printf("%.4f", (i + j));
        }
        if (z.equals("-")) {
            System.out.print("Разность чисел = ");//Выводим форматированную разность переменных
            System.out.printf("%.4f", (i - j));
        }
        if (z.equals("/")) {
            System.out.print("Частное чисел = ");//Выводим форматированное частное переменных
            System.out.printf("%.4f", (i / j));
        }
        if (z.equals("*")) {
            System.out.print("Произведение чисел = ");//Выводим форматированное произведение переменных
            System.out.printf("%.4f", (i * j));
        }


        scanner.close();

    }

}
