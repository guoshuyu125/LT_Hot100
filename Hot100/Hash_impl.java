package Hot100;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hash_impl {

    Hash hot100_hash = new Hash();
    public void hash_findSum_1_impl(){
        int[] arr = new int[]{1,2,3,4,5};
        int[] output = new int[2];
        output = hot100_hash.findSum_1(arr, 3);
        System.out.println(Arrays.toString(output));
    }
    public void hash_findSum_2_impl(){
        int[] arr = new int[]{1,2,3,4,5};
        int[] output = new int[2];
        output = hot100_hash.findSum_2(arr, 3);
        System.out.println(Arrays.toString(output));
    }

    public void groupAnagrams_1_impl()
    {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = new ArrayList<List<String>>();
        output = hot100_hash.groupAnagrams_1(strs);
        System.out.println(output);
    }
    public void longestConsecutive_impl()
    {
        int[] nums = new int[]{100,4,200,1,3,2};
        int output = hot100_hash.longestConsecutive(nums);
        System.out.println(output);
    }
}
