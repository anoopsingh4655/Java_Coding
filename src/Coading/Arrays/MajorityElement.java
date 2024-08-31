package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */

public class MajorityElement {

    public static void main(String[] args){

        int[] nums = {2,2,1,1,1,2,2};
        int majorityElement = getMajorityElement(nums);
        System.out.println("Majority is " + majorityElement);

    }

    public static int getMajorityElement(int[] nums){

        int n = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0 ; i < n; i++){
            if(numMap.containsKey(nums[i])){
                numMap.put(nums[i], numMap.get(nums[i]) + 1);
            }else
                numMap.put(nums[i] , 1);
        }

        for(Map.Entry<Integer, Integer> map : numMap.entrySet()){
            int numCount = map.getValue();
            int numKey = map.getKey();

            if(numCount > n/2){
                return numKey;
            }

        }
    return 0;
    }
}
