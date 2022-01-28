package BinarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        int[] arr = {99,88,77,66,55,32,11,9,-3,-88,-99};
        int target = -88;
        System.out.println(orderAgnostic(arr,target));
    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        // checking is array is ascending or not
        boolean isAscend = arr[start] < arr[end];

        while(start <= end){
            // find mid
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) return mid;

            // For Ascending sorted array
            if(isAscend){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            // For Descending Sorted Array
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

