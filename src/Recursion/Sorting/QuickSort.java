package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5,8,9,-2,0,98,-22,55};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int hi){

        // low and hi are just the start and end pointers of arr
        if(low >= hi) {
            return;
        }
        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        // taking pivot as the mid element
        int pivot = arr[mid];

        // condition for swapping
        while (start <= end){

            // while start element is less than pivot
            // keep moving ahead
            while (arr[start] < pivot){
                start++;
            }
            // while end element is greater than pivot
            // keep moving the end pointer by 1
            while (arr[end] > pivot){
                end--;
            }

            // when the above while loop condition is violated
            // i.e start element is greater than pivot and end element is smaller than pivot
            // swap those two elements and move ahead from both side
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] =temp;
                start++;
                end--;
            }
        }
        // now the pivot is at the correct index , sort the two halves
        // recursive call
        quickSort(arr, low, end);
        quickSort(arr, hi, start);
    }
}
