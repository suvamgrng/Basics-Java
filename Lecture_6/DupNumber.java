package Lecture_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DupNumber {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        DupNumber dupNumber = new DupNumber();
        int[] nums = {1, 2, 3, 3, 4};
        System.out.println(dupNumber.hasDuplicate(nums));
    }
}
