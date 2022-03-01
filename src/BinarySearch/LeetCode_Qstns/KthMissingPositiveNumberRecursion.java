package BinarySearch.LeetCode_Qstns;

public class KthMissingPositiveNumberRecursion {

    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,11};
        System.out.println(findKthPositive(arr,4,0,arr.length-1));
    }

    public static int findKthPositive(int[] arr, int k, int start, int end) {

        int missing = 0;
        if(start >= end){
            missing = arr[start] - start - 1;
            if (missing >= k){
                k = missing - k + 1;
                return arr[start] - k;
            }
            else{
                k -= missing;
                return arr[start + k];
            }
        }
        // middle element
        int mid = start + (end - start) / 2;

        missing = arr[mid] - mid - 1;
        if(missing > k){
            return findKthPositive(arr, k, start, mid - 1);
        }
        else{
            return findKthPositive(arr, k, mid + 1, end);
        }
    }
}
