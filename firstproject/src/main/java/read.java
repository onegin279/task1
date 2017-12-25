package Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import static java.awt.SystemColor.text;


public class read {

    public static void main(String[] args) throws IOException {

        String[] text = new String[0];
        try {
            String str = null;
            BufferedReader br = new BufferedReader(new FileReader("/Users/service/Desktop/Git/task1/firstproject/src/main/java/Read/words.txt"));
            while ((str = br.readLine()) != null) {
                //получаем новые слова
                String[] newWords = str.split(" ");
                //создаем расширенный массив
                String[] result = new String[text.length + newWords.length];
                //копируем элементы в массив
                System.arraycopy(text, 0, result, 0, text.length);
                System.arraycopy(newWords, 0, result, text.length, newWords.length);
                //присваиваем результирующий массив текущему
                text = result;
            }
            br.close();
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
        }
        Arrays.sort(text);//сортируем массив
        System.out.println(Arrays.toString(text));

    }
    }

