package Lecture_6;

import java.util.Arrays;

public class DupNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] num) {
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (num[i] == num[i + 1]) {
                return true;
            }
        }
        return false;
    }

}
