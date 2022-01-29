package BinarySearch.LeetCode_Qstns;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

/*
    Algorithm :
    1. We are given an infinite sorted array
    2. so we cant apply arr.length function bcoz its length is infinite.
    3. So we will divide the array in small chunks.
    4. Then try to find our target in those chunks.
    5. We will exponentially increase the size of chunk.
    6. And apply binary search

    Approach :
    1. First take a chunk of size 2.
    2. Then check our target is bigger then the end element of chunk
    3. If target is bigger, we will double the size of chunk
    4. Then again we will check if target is bigger than the end element ..if it is then again double the chunk.
    5. If not , it means our target is inside the chunk.
    6. We will apply the simple Binary Search in that chunk
    7. If target found ..return the index , if not found return -1.

 */

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170,450,700,800,900,990,7887,9999,90000,890989};
        int target = 130;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target){

        // first find the range
        int start = 0;
        int end = 1;

        // condition for target to lie in Range
        while (target > arr[end]){
            int newStart = end + 1;

            // double the value of box
            // end = previous end + sizeOfBox * 2;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }

    static int search(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
