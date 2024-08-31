package Coading.Arrays;


/**
 * Find the index middle element
 * Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
 *
 * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 *
 * If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
 *
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 */
public class IndexMiddleElement {

    public static void main(String[] args){

        int[] nums = {2,5};

       // int result = findMiddleIndex(nums);
        int resultV2 = findMiddleIndexV2(nums);
      //  System.out.println(" Result " + result);
        System.out.println("result V2 " + resultV2);
    }

    public static int findMiddleIndex(int[] nums) {

        for(int i = 0 ; i < nums.length; i++){
            int mid = i;
            int left = 0 ;
            int right = 0;
            for(int n = 0 ; n < i; n++){
                left = left + nums[n];
            }
            for(int j = i + 1; j < nums.length; j++){
                right = right + nums[j];
            }
            if(left == right){
                return mid;
            }
        }


        return -1;
    }

    public static int findMiddleIndexV2(int[] nums){
        int totalSum = 0;
        for(int i = 0 ; i < nums.length; i++){
            totalSum += nums[i];

        }
        int left = 0 ;
        for(int n = 0 ; n < nums.length ; n++){

            int right = totalSum - left - nums[n];

            if(left == right)
                return n;

            left += nums[n];
        }

        return -1;
    }
}
