package BinarySearch.LeetCode_Qstns;

public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args) {
        int[] arr ={11,12,13,13,15,17,17,1,3,5,7,9};
        int target = 0;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        int pivot = pivotWithDuplicates(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0, arr.length - 1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
    }
        return binarySearch(arr,target,pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int pivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // if elements at the start, middle and the end are equal then just skip the duplicates.
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicate
                // Note : What if the start or end elements were the pivot
                // Check if Start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start ++;

                // check if End is pivot
                if(arr[end] < arr[end-1])
                end --;
            }
            // left side is sorted so pivot should be in the right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
