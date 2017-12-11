
import java.util.Arrays;
import java.util.Map;

public class second {


    public static void main(String[] args) {

        int ch1;
        int ch2;
        //Заполнение массива рандомными значениями от -10 до 10
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = -10 + (int) (Math.random() * 21);

        }

        //Поиск минимального и максимального занчения массива
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];

        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];

        }

        System.out.println(Arrays.toString(array));
        System.out.println("Минимум массива = " + min);
        System.out.println("Максимум массива = " + max);


        //Поиск максимального отрицательного значения
        int max_ot = 0;
        int j;
        for (j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                max_ot = array[j];
                break;
            }
        }
        for (j = 0; j < array.length; j++) {
            if (array[j] < 0 && array[j] > max_ot)
                max_ot = array[j];
        }
        if (max_ot == 0)
            System.out.println("Отрицательных элементов не найдено");
        else
            System.out.println("Максимальный отрицательный элемент = " + max_ot);


        //Поиск минимального положительного значения
        int min_po = 0;
        int k;
        for (k = 0; k < array.length; k++) {
            if (array[k] > 0) {
                min_po = array[k];
                break;
            }
        }
        for (k = 0; k < array.length; k++) {
            if (array[k] > 0 && array[k] < min_po)
                min_po = array[k];
        }
        if (min_po == 0)
            System.out.println("Положительных элементов не найдено");
        else
            System.out.println("Минимальный положительный элемент = " + min_po);


        }
    }














