import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class TextUtils {

    public static Map<String, Integer> getMapWithEstimatedWords(String text) {

        String temp = text.toLowerCase();
        String[] wordsArray = temp.split(" |\\.|,|\\?|!|\\(|\\)");

        Map<String, Integer> mapOfWords = new HashMap<>();

        for (String word : wordsArray) {
            if (!word.equals("")) {
                MapUtils.addOrChangeInMap(mapOfWords, word, 1);
            }
        }
        return mapOfWords;
    }

    public static Map<String, Integer> getMapWithEstimatedWordsFromFile(String text) {
        Map<String, Integer> retMap = null;
        Map<String, Integer> tempMap;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(text));

            String str = reader.readLine();
            retMap = TextUtils.getMapWithEstimatedWords(str);

            str = reader.readLine();
            while (str != null) {
                tempMap = TextUtils.getMapWithEstimatedWords(str);
                MapUtils.mergeMap(retMap, tempMap);
                str = reader.readLine();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.exit(0);
        } catch (IOException e) {
            System.exit(0);
        }
        return retMap;
    }
}
