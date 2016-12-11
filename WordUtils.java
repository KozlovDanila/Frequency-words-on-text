import java.util.HashMap;
import java.util.Map;

public final class WordUtils {

    public static Map<String, Integer> getMapWithEstimatedWords(String text) {

        String temp = text.toLowerCase();
        String[] wordsArray = temp.split(" |\\.|,|\\?|!|\\(|\\)");

        Map<String, Integer> mapOfWords = new HashMap<>();

        for (String word : wordsArray) {
            if (!word.equals("")) {
                addOrChangeInMap(mapOfWords, word);
            }
        }
        return mapOfWords;
    }

    private static void addOrChangeInMap(Map<String, Integer> map, String element) {
        if (!map.containsKey(element)) {
            map.put(element, 1);
        } else {
            Integer tempValue = map.get(element);
            map.put(element, tempValue + 1);
        }
    }
}
