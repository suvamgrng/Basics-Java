package Lecture_6;

import java.util.HashSet;
import java.util.Set;

public class DupNumber {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num: nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DupNumber dupNumber = new DupNumber();
        int[] nums = {1,2,3,3,4};
        System.out.println(dupNumber.hasDuplicate(nums));
    }
}
