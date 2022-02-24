package Recursion.Sorting;

import java.util.Arrays;

/*
      Merge Sorting without using the copy arrays and instead changing the original array

 */
public class MergeSortInPlace {

    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 9, 0, 2, 4, -3, -8};
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int start, int end){

        if(end-start == 1){
            return;
        }
        int mid = start + (end - start) / 2;

        // sorting the array from start to mid
        mergeSortInPlace(arr, 0, mid);
        // sorting the array from mid to end
        mergeSortInPlace(arr, mid, end);

        // merge the sorted array
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mixArr = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        // check if arr[i] is less than arr[j]
        // add the smallest element in new Array and move the pointer
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mixArr[k] = arr[i];
                i++;
            } else {
                mixArr[k] = arr[j];
                j++;
            }
            k++;
        }

        // if one array is incomplete
        // add all the remaining elements in the newArr
        while (i < mid) {
            mixArr[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mixArr[k] = arr[j];
            j++;
            k++;
        }

        // iterating the new Merged array
        for (int l = 0; l < mixArr.length; l++) {
            arr[start+l] = mixArr[l];
        }
    }
}
