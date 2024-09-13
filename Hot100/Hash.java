package Hot100;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hash {
    public int[] findSum_1(int[] nums, int target)
    {
        // int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("找不到");
    }

    public int[] findSum_2(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("找不到");
    }

    public List<List<String>> groupAnagrams_1(String[] strs)
    {
        Map<String ,List<String>> map = new HashMap<String ,List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public int longestConsecutive(int[] nums)
    {
        int lengthMax = 0;
        int currentMax = 0;
        Set<Integer> numbers = new HashSet<>();

        for(int num : nums)
        {
            numbers.add(num);
        }

        for (int num : numbers) {
            if (!(numbers.contains(num - 1))) {
                currentMax = 1;
                while (numbers.contains(num + currentMax)) {
                    currentMax++;
                }
                lengthMax = Math.max(lengthMax, currentMax);
            }
        }

        return lengthMax;
    }







}
