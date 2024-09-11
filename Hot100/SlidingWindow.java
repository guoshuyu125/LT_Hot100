package Hot100;

import java.util.HashSet;
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
}
