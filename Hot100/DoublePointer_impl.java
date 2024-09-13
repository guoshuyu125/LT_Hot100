package Hot100;

import java.util.Arrays;
import java.util.List;

public class DoublePointer_impl {
    public void moveZeros_impl()
    {
        DoublePointer doublePointer = new DoublePointer();
        int[] nums = new int[]{1,0,1};
        doublePointer.moveZeros_2(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void maxArea_impl(){
        DoublePointer doublePointer = new DoublePointer();
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        int output = doublePointer.maxArea(nums);
        System.out.println(output);
    }
    
    public void threeSum_impl(){
        DoublePointer doublePointer = new DoublePointer();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> output = doublePointer.threeSum(nums);
        System.out.println(output);
    }
    

}
