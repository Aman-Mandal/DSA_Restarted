package BinarySearch.LeetCode_Qstns;

public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 1){
            return arr[0];
        }
        if(arr[start] != arr[start+1]){
            return arr[start];
        }
        if(arr[end] != arr[end-1]){
            return arr[end];
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == arr[mid-1]){
                if(mid % 2 == 0){
                    end = mid - 2;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(arr[mid] == arr[mid+1]){
                if(mid % 2 == 0){
                    start = mid + 2;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
