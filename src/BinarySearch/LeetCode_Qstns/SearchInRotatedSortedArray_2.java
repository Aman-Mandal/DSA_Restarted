package BinarySearch.LeetCode_Qstns;

// Wrong Code !!!

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/


public class SearchInRotatedSortedArray_2 {

    public static void main(String[] args) {

        int[] arr = {3,5,7,10,10,11,14,16,12,11,11,9,-1,-8};
        int target = 9;
        System.out.println(search(arr,target));
    }

    static boolean search(int[] nums, int target){
        int pivot = pivotWithDuplicates(nums);

        if(pivot == -1){
           return binarySearch(nums,target,0,nums.length - 1);
        }
        if(nums[pivot] == target){
            return true;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length - 1);
    }

    static int pivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // if elements at the start, middle and the end are equal then just skip the duplicates.
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicate
                // Note : What if the start or end elements were the pivot
                // Check if Start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start ++;

                // check if End is pivot
                if(arr[end] < arr[end-1])
                    end --;
            }
            // left side is sorted so pivot should be in the right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static boolean binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid + 1]){
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }

}
