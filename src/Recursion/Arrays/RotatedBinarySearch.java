package Recursion.Arrays;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,4,5};
        int target = 0;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]){
            return mid;
        }

        if(arr[start] <= arr[mid]){

            // target is present in the left part of arr
            if(target >= arr[start] && target <= arr[mid]){
                return search(arr, target, start, mid - 1);
            }
            // else check in the remaining array
            else {
                return search(arr, target, mid + 1, end);
            }
        }
        // target is in the right part of arr
        if(target >= arr[mid] && target <= end){
            return search(arr, target, mid + 1, end);
        }
        // else check in remaining arr
        return search(arr, target, start, mid - 1);
    }
}
