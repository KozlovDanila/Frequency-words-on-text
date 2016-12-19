import java.util.Map;

public class MapUtils {

    public static void mergeMap(Map<String, Integer> first, Map<String, Integer> second) {

        for (Map.Entry entry : second.entrySet()) {
            String word = (String) entry.getKey();
            Integer secondCount = (Integer) entry.getValue();
            addOrChangeInMap(first, word, secondCount);
        }
    }

    public static void addOrChangeInMap(Map<String, Integer> map, String element, int count) {
        if (!map.containsKey(element)) {
            map.put(element, count);
        } else {
            Integer tempValue = map.get(element);
            map.put(element, tempValue + count);
        }
    }

    public static void print(Map<String, Integer> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}
