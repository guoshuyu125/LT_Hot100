package Hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SlidingWindow {
    public int lengthOfLongestSubString(String str)
    {
        Set<Character> subStr = new HashSet<>();
        int maxLength = 0;
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i != 0) {
                subStr.remove(str.charAt(i-1));
            }

            while (j<str.length() && !subStr.contains(str.charAt(j))) {
                subStr.add(str.charAt(j));
                j++;
            }

            maxLength = Math.max(maxLength, subStr.size());
        }
        return maxLength;
    }   

    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> targetMap = new HashMap<>();
        Map<Character, Integer> windowsMap = new HashMap<>();
        char c;
        for (int i = 0; i < p.length(); i++) {
            c = p.charAt(i);
            targetMap.put(c, targetMap.getOrDefault(c, 0)+1);
        }

        int left = 0;
        int right = 0;
        
        while (right < s.length()) {
            c = s.charAt(right);
            windowsMap.put(c, windowsMap.getOrDefault(c, 0)+1);

            while ((right - left) >= p.length()) {
                c = s.charAt(left);
                windowsMap.put(c, windowsMap.get(c) - 1);
                left ++;
            }
            // System.out.println(windowsMap.toString());

            int same = 1;
            for (Character ch : targetMap.keySet()) {
                // if (windowsMap.size()>=targetMap.size()) {
                //     if (windowsMap.get(ch).equals(targetMap.get(ch)) == false) {
                //         same = 0;
                //     }
                    
                // }
                if (windowsMap.containsKey(ch)) {
                    if (!windowsMap.get(ch).equals(targetMap.get(ch))){
                        same = 0;
                    }
                }else{
                    same = 0;
                }
            }
            if (same == 1 && windowsMap.size()>=targetMap.size()) {
                result.add(left);
            }
            right ++;
        }
            // System.out.println(targetMap.toString());

        return result;
    }

}
