package Lecture_6;

import java.util.Arrays;

/**Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.*/
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3,4};
        System.out.println(missingNumber(nums));
    }
}
