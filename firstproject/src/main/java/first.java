/**
 * @author onegin
 * @see #// STOPSHIP: 03.12.17
 * @see java.lang.System
 */


import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект scaner
        System.out.println("Выберите операцию(1-калькулятор, 2-поиск макс. слова:");
        int o = scanner.nextInt();

        if (o == 1) {
            Scanner scanner2 = new Scanner(System.in); //Создаем объект scaner
            System.out.println("Введите первое число:");
            double i = scanner2.nextDouble(); //Записываем введеное число в переменную i
            System.out.println("Введите второе число:");
            double j = scanner2.nextDouble(); //Записываем введеное число в переменную j
            System.out.println("Выберите операцию (+, -, * ,/):");
            String z = scanner2.next(); //Записываем операцию в переменную z

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
        } else if (o == 2) {
            Scanner scanner3 = new Scanner(System.in); //Создаем объект scaner
            System.out.println("Введите длинну масива:");
            int al = scanner3.nextInt();
            String[] array = new String[al];
            int[] array1 = new int[array.length];

            for (int i = 0; i < al; i++) {
                System.out.println("Введите " + (i + 1) + "-е слово:");
                Scanner scanner4 = new Scanner(System.in);
                array[i] = scanner4.next();
            }

            for (int j = 0; j < array.length; j++) {
                array1[j] = array[j].length();
            }

            int maximum = array1[0];

            for (int i = 0; i < array.length; i++)
                if (maximum < array1[i]) maximum = array1[i];
            System.out.println("Количество букв в самом длинном слове = " + maximum);


        } else if (o != 1 && o != 2) {
            System.out.println("Error");
        }


        scanner.close();

    }
}