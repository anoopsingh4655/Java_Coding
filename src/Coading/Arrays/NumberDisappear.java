package Coading.Arrays;

import java.util.*;

/**
 * Find all the number disappear in the array
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 *
 */
public class NumberDisappear {
    public static void main(String[] args){

        int[] nums = {1,1};
        List<Integer> result = findNumberDisappear(nums);
        System.out.println("Result " + result);


    }

    public static List<Integer> findNumberDisappear(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for(int num  : nums){
            numSet.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 1 ; i <= nums.length ; i++){
            if(!numSet.contains(i)){
                result.add(i);
            }
        }
        return result;

    }
}
