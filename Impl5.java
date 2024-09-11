import java.util.Arrays;

public class Impl5 {
    public void C001Impl() {

        Classic5 C001 = new Classic5();
        int []nums1 = {1,2,3,0,0,0};
        int []nums2 = {2,5,6};
        int []nums3 = C001.c001merge2(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums3));
    }
    public void C002Impl(){
        Classic5 C002 = new Classic5();
        int[] nums = {1,2,3,4,5};
        int val = 3;
        int len = C002.c002removeElement2(nums, val);
        System.out.println(len);
    }
    public void C003Impl(){
        Classic5 C003 = new Classic5();
        int[] nums = {1,2,2,4,5};
        int len = C003.c003removeDuplicates(nums);
        System.out.println(len);
    }
    
    public void C004Impl(){
        Classic5 C004 = new Classic5();
        int[] nums = {1,1,2,2,2,3,3,3,3,3,4,4,5,5,7,7,9,9};
        int len = C004.c004removeDuplicates(nums);
        System.out.println(len);
        System.out.println(Arrays.toString(nums));
    }
}
