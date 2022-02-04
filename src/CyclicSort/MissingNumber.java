package CyclicSort;
// https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {

        // Sorting the array using cycle sort algo
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int correct = arr[i];
            if (arr[i] < n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Finding the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // 2nd case : if n is the missing number
        return n;
    }

    // function for swapping
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
