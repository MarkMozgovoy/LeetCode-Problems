/*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        while(i < nums.length - 1){
            int j = i+1;
            while(j < nums.length){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                j++;
            }
            i++;
        }
        throw new IllegalArgumentException("No solution");
    }
}
