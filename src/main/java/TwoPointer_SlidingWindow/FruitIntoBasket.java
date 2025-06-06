package TwoPointer_SlidingWindow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FruitIntoBasket {

    public static int totalFruits(int[] fruits) {
        int count = 0, k = 2;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int fruit : fruits) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        }

        HashMap<Integer, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> integer, LinkedHashMap::new));
        System.out.println(sortedMap);
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            count += entry.getValue();
            k--;
            if (k <= 0)
                break;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 0, 1, 4, 1, 4, 1, 2, 3};
        System.out.println(totalFruits(fruits));
        System.out.println(totalFruit(fruits));
        System.out.println(totalFruitOptimal(fruits));
    }

    private static int totalFruitOptimal(int[] fruits) {
        // 0(n)
        int left = 0, right = 0, maxLen = 0, len = 0, k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            if (map.size() > k) {
                int num = fruits[left];
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) map.remove(num);
                left++;
            }
            if (map.size()<=k) {
                len = right - left + 1;
                maxLen = Math.max(maxLen, len);
            }
            right++;
        }
        return maxLen;
    }

    public static int totalFruit(int[] fruits) {
        // 0(n+n)
        int left = 0, right = 0, maxLen = 0, len = 0, k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            if (map.size() > k) {
                while (map.size() > k) {
                    int num = fruits[left];
                    map.put(num, map.get(num) - 1);
                    if (map.get(num) == 0) map.remove(num);
                    left++;
                }
            }
            len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            right++;
        }
        return maxLen;
    }
}
