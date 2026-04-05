package DSA_JAVA;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("1929. Concatenation of Array");
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }

    // 1929. Concatenation of Array
    // You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    // Specifically, ans is the concatenation of two nums arrays.
    // Return the array ans.
    public static int[] getConcatenation(int[] nums) {
        int arraySize = nums.length;
        int[] newArr = new int[arraySize * 2];
        for(int i=0; i<arraySize; i++) {
            newArr[i] = nums[i];
            newArr[i + arraySize] = nums[i];
        }
        return newArr;
    }
}