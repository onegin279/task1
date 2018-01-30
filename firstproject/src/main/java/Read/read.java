package Read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class read {

    public static void main(String[] args) throws IOException {

        String[] text = new String[0];

        Path path = Paths.get("/Users/service/Desktop/Git/task1/firstproject/src/main/java/Read/words.txt");
        byte[] fileBytes = Files.readAllBytes(path); //- еще есть метод Files.lines(path) - он читает построчно и пишет в Stream<String>
        String data = new String(fileBytes);
        List<String> wordCol = Arrays.asList(data.split(" "));

        Collections.sort(wordCol);
        System.out.println(wordCol);



        HashMap<String, Integer> wordToCount = new HashMap<>();

        for (String word : wordCol) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, (wordToCount.get(word) + 1));

        }
        System.out.println(wordToCount);
        int k = Collections.max(wordToCount.values());
       System.out.print(wordCol.get(k));

        }
    }








