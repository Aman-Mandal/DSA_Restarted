package CyclicSort;

/*
        Algorithm:

        Note : Use this Algo whenever we are given range of [1, N]

        1. start from i = 0...i.e index = 0 and check whether the element at Index i = i + 1;
        2. So find the correct Index = element at i - 1 .. i.e arr[i] - 1;
        3. then check the condition that arr[i] != arr[correctIndex] and swap the elements
        4. and if they are on the proper index .. increase the I pointer.

 */

import java.util.Arrays;

public class cyclicSort {

    public static void main(String[] args) {

        int[] arr = {3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){

        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
