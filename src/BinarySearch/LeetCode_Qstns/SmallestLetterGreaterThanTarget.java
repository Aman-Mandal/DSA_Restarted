package BinarySearch.LeetCode_Qstns;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'a','c','f','h','k','z'};
        char target = 'a';
        System.out.println(search(arr,target));
    }

    static char search(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // if letter not found then
        // returns the first letter because array is wrapped
         return arr[start % arr.length];
    }
}
