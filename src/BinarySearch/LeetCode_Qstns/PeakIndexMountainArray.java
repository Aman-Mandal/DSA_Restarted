package BinarySearch.LeetCode_Qstns;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

/*
    Approach :
    1. We know its a Mountain Array, So we have to find the peak element.
    2. We will find the mid element and check whether the mid is greater than mid + 1.
    3. if arr[mid] > arr[mid + 1] it means we are in the descending part of the arr
    4. so we will check the left side of mid for peak. ie. end = mid + 1
    5. if arr[mid] < arr[mid + 1] it means we are in the ascending part
    6. so we will check the right side for peak i.e start = mid + 1
    7. at last start and end both will point on the peal element ... so return end or start
 */
public class PeakIndexMountainArray {

    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndex(arr));
    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            // Descending part of arr
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            // Ascending part of arr
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        // in the end start and end both will be pointing to the same element which is the peak
        return start;
    }
}
