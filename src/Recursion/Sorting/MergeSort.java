package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {1, 7, 9, 2, 4, 3, 2, 11, 2, 6};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr){

        // base condition
        if(arr.length == 1){
            return arr;
        }
        // dividing arr into 2 arr
        int mid = arr.length / 2;
        // sort the left arr
        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        // sort the right arr
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        // merge the left and right arr
        return merge(leftArr, rightArr);
    }

    private static int[] merge(int[] leftArr, int[] rightArr) {

        int[] mixArr = new int[leftArr.length + rightArr.length];

        // pointers of the left , right and mix Arrays
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftArr.length && j < rightArr.length){
            if (leftArr[i] < rightArr[j]){
                mixArr[k] = leftArr[i];
                i++;
            }
            else {
                mixArr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one array is finished and other is not finished
        // put the remaining elements in the mixArr
        while (i < leftArr.length){
            mixArr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length){
            mixArr[k] = rightArr[j];
            j++;
            k++;
        }
        return mixArr;
    }
}
