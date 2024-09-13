package Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DoublePointer {
    public void moveZeros_1(int[] nums)
    {
        int zeroNum = 0;
        for (int i = 0; i < nums.length - zeroNum; i++) {
            while (nums[i] == 0 && nums.length - i > zeroNum) {
                for (int j = i; j < nums.length - zeroNum - 1; j++) {
                    nums[j] = nums[j+1];
                }//这样循环内改一片的时间复杂度好高哦
                nums[nums.length - zeroNum - 1] = 0;
                zeroNum ++;
            }
        }
    }

    public void moveZeros_2(int[] nums){
        int temp;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] == 0)) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j ++;
            }
        }
    }

    public int maxArea(int[] nums){
        int lift = 0;
        int right = nums.length - 1;
        int tempArea = 0;
        int maxArea = 0;
        while (lift < right) {
            tempArea = Math.min(nums[lift], nums[right]) * (right - lift);
            if (tempArea > maxArea) {
                maxArea = tempArea;
            }

            if (nums[lift] > nums[right]) {
                right--;
            }else{
                lift ++;
            }
        }
        return maxArea;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> tempResult = new HashSet<>();
        int i, j, k;
        for(i=0; nums[i]<=0 && i<nums.length-2; i++)
        {
            j = i + 1;
            k = nums.length - 1;
            while(j<k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum>0)
                {
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }else
                {
                    tempResult.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    k--;
                    j++;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(tempResult);
        return result;
    }
 

}
