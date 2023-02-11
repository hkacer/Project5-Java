package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static int missingNumber(int[] nums, int maxNum) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return maxNum + 1;
    }

        public static int solution1(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) {
                    return i + 1;
                }
            }
            return nums.length + 1;
        }
    public static int solution2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= nums.length + 1; i++) {
            set.add(i);
        }
        for (int num : nums) {
            set.remove(num);
        }
        return set.iterator().next();
    }

    public static int solution3(int[] nums) {
        int expectedSum = (nums.length + 1) * (nums.length + 2) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }



}






