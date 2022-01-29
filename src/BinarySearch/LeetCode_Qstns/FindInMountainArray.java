package BinarySearch.LeetCode_Qstns;
// https://leetcode.com/problems/find-in-mountain-array/

/*
    Approach :
    1. Find the peak Element
    2. Use the OrderAgnostic BS to check in Ascending as well as Descending array.
    3. Now we will find the target in the ascending arr ie. from 0 to peak
    4. If target found return index
    5. If not found we will check in the Descending Array ie. from peak+1 to arr.lenth - 1;

 */

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + end - start / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAscending){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
