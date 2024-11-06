import java.util.*;

public class MostFreqElement {

    public static int mostFreqElement(int nums[]) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxFreq = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(num));
        }

        System.out.println(map.entrySet());

        for (var key : map.keySet()) {
            if (map.get(key) == maxFreq) return key;
        }

        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {1,3,2,1,4,1,4,3,5,4,3,4,3};
        System.out.println(mostFreqElement(nums));
    }
}