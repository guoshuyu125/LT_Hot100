package Hot100;

import java.util.List;

public class SlidingWindow_impl {
    public void lengthOfLongestSubString_impl(){
        SlidingWindow slidingWindow = new SlidingWindow();
        String str = "abcabcbb";
        int output = slidingWindow.lengthOfLongestSubString(str);
        System.out.println(output);
    }
    public void findAnagramsImpl(){
        SlidingWindow slidingWindow = new SlidingWindow();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> output = slidingWindow.findAnagrams(s, p);
        System.out.println(output);
    }
}
