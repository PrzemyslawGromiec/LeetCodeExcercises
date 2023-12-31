package org.example.two_sum;

public class Solution {

   /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.*/

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }



    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int target = 9;
        int[] result = twoSum(nums,target);

        if(result != null) {
            System.out.println("Indexes you're looking for are: " + result[0] + " and " + result[1]);
            System.out.println("And that means: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target + "(target)");
        } else {
            System.out.println("Numbers don't match.");
        }


    }
}
