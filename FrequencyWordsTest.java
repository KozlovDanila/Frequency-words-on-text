import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class FrequencyWordsTest {

    @Test
    public void testWhatFuncWork() throws Exception {
        String text = "Removes the first occurrence of the specified element from the specified array. All subsequent" +
                " elements are shifted to the left (substracts one from their indices). If the array doesn't contains" +
                " such an element, no elements are removed from the array.";
        Map<String, Integer> map;

        map = TextUtils.getMapWithEstimatedWords(text);
        Assert.assertTrue(map != null);

    }

    @Test
    public void testForCountWord() throws Exception {
        String text = "a, a, a, b, b, b, k";
        Map<String, Integer> map;

        map = TextUtils.getMapWithEstimatedWords(text);
        Assert.assertTrue(map.get("a") == 3);
        Assert.assertTrue(map.get("k") == 1);
        Assert.assertTrue(map.containsKey("v") == false);
    }

}