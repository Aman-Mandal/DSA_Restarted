package BinarySearch.LeetCode_Qstns;
// https://leetcode.com/problems/search-in-rotated-sorted-array/

/*
    Approach :
    1. First find the Pivot element from the array .. A pivot is the highest number in the array after rotation.
    2. Then apply the binary search from start to the pivot
    3. If target found then return the index
    4. Otherwise, search in the remaining part of the array
 */

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int target = 5;
        System.out.println(search(arr,target));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if pivot not found means array is not rotated
        if(pivot == -1){
            return binarySearch(nums,target,0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        // if target is greater than start
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
