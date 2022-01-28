package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 19, 45, 67};
        int target = 8;
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + end - start / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
/*
    Note :
    When the Condition of the While loop is violated ie.
    while(start <= end)
    the loop breaks means, at that time end will be smaller than the start
    so , bcoz start is greater than the end value , our end will be the floor of our target number
    and hence we will return end !
 */
