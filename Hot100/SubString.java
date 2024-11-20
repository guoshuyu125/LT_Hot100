package Hot100;

import java.util.HashMap;

public class SubString {
    public int subarraySum_1(int[] nums, int k) {
        int count = 0;
        for (int left = 0; left < nums.length; left++) {
            int sum = 0;
            for (int right = left; right < nums.length; right++) {
                sum += nums[right];
                if (sum == k) {
                    count ++;
                }
            }
        }
        return count;
    }

    public int subarraySum_2(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer>preSum = new HashMap<>();
        preSum.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);

            if (preSum.containsKey(sum - k)) {
                count += preSum.get(sum - k);
            }
            
        }
        return count;
    }
}
