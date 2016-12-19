import java.util.Map;

public class App {

    public static void main(String[] args) {
        Map<String, Integer> map = TextUtils.getMapWithEstimatedWordsFromFile(args[0]);
        MapUtils.print(map);
    }

}
