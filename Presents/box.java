import presents.presents;
import presents.Candy;
import presents.Jellybean;

import java.util.Arrays;


public class box {

    public static void main(String[] args) {
        Candy candy1 = new Candy("Snickers", 80.00, 110.00, 1);
        Candy candy2 = new Candy("Nuts", 60.00, 120.00, 2);
        Jellybean jellybean1 = new Jellybean("Limon", 20.00, 50.00, 3);
        presents[] box = {candy1, candy2, jellybean1};
        for (presents Presents : box) {


            double oVes = 0;
            double oPrice = 0;
            for (presents box1 : box) {
                System.out.println(box1.toString());
                oVes += box1.getVes();
                oPrice += box1.getPrice();


            }

            System.out.println("Общий вес: - " + oVes);
            System.out.println("Общая стоимость:" + oPrice);
            break;
        }

    }
    }




