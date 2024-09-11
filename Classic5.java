import java.util.Arrays;

public class Classic5 {

    public int[] c001merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            nums1[m++] = i;
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public int[] c001merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int current = 0;
        int length = m+n-1;
        // 只能是或的关系，因为两个指针都结束，循环才能结束
        while (p1>=0 || p2>=0) {
            if (p1<0) {
                current = nums2[p2--];
            }else if (p2<0) {
                current = nums1[p1--];
            }else if (nums1[p1]>nums2[p2]) {
                current = nums1[p1--];
            }else {
                current = nums2[p2--];
            }
            nums1[length--] = current;
        }
        return nums1;
    }
    public int c003removeDuplicates(int[] nums) {
        int i, j;
        for(i=0,j=1 ; j<nums.length ; j++){
            if (nums[i] == nums[j]) {
                continue;
            }else{
                nums[i+1]=nums[j];
                i++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        return i+1;
    }



    public int c002removeElement(int[] nums, int val){
        int length = 0;
        for(int i=0,j=0 ; i<nums.length ; i++){
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            length = j;
        }
        return length;
    }
    public int c002removeElement2(int[] nums, int val){
        int i,j;
        for(i=0, j=nums.length-1 ; i<=j ; ){
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            }else{
                i++;
            }
        }
        return i;

    }
    public int c004removeDuplicates(int[] nums) {
        int fast = 2;
        int slow = 2;
        for (fast = 2; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast-2] || nums[fast] != nums[fast-1]) {
                
                nums[slow] = nums[fast];
                System.out.println(fast);
                slow++;
            }
        }
        // while (fast < nums.length) {
        //     if (nums[slow - 2] != nums[fast]) {
        //         nums[slow] = nums[fast];
        //         ++slow;
        //     }
        //     ++fast;
        // }
        return slow;
    }



}
