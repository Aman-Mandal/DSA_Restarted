package BinarySearch.LeetCode_Qstns;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSum_2 {

    public static void main(String[] args) {

    }
    static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[start]+arr[end]){
                end--;
            }
            else if(target > arr[start]+arr[end]){
                start++;
            }
            else{
                return new int[] {start+1,end+1};
            }
        }
        return new int[]{-1, -1};
    }
}
