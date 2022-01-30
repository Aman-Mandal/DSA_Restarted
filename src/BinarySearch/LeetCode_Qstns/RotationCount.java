package BinarySearch.LeetCode_Qstns;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

/*
    We have to count the no. of times array has rotated.

    Approach :
    1. Find the Pivot and return the index value of it
    2. Then add 1 in the pivot
    3. Thats all

 */
public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = rotationCount(arr);
        System.out.println(ans);
    }

    static int rotationCount(int[] arr){
        int pivot = pivot(arr);
        int count = pivot + 1;
        return count;
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
