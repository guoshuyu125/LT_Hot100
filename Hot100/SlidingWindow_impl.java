package Hot100;

public class SlidingWindow_impl {
    public void lengthOfLongestSubString_impl(){
        SlidingWindow slidingWindow = new SlidingWindow();
        String str = "abcabcbb";
        int output = slidingWindow.lengthOfLongestSubString(str);
        System.out.println(output);
    }
}
