package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,4,78,90,999,3843};
        int target = 78;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find mid
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // return mid
                return mid;
            }
        }
        return -1;
    }
}
