package BinarySearch.LeetCode_Qstns;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {
    public static void main(String[] args){

    }

    /* Algorithm :
        1. Do the BS and find the target
        2. Try finding the first occurrence
        3. For first occurrence we will do binary search again on the left side of our target found
        4. if we found any occurence on left ..it will be the new first occurrence.
        5. And same goes for the right side for last occurrence
     */

    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};

        int start = search(arr,target,true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] arr, int target, boolean isFirstOccurence){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                // updating potential answer
                ans = mid;

                if (isFirstOccurence){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
