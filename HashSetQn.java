package DSA_JAVA;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetQn {
    public static void main(String[] args) {
        System.out.println("hasDuplicate");
        System.out.println(hasDuplicate(new int[]{1,3,5,6,6}));
    }

    // Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
    public static boolean hasDuplicate(int[] nums) {
        // HashSet<Integer> hashSet = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (hashSet.contains(nums[i])) {
        //         return true;
        //     } else {
        //         hashSet.add(nums[i]);
        //     }
        // }
        // return false;

        // OR
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
