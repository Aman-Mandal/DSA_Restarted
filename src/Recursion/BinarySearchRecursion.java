package Recursion;

public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,98,988,8888,787878};
        int target = 88889;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end){

        // base condition
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(target == arr[mid]){
            return mid;
        }
        if(target > arr[mid]){
            return search(arr, target, mid + 1, end);   // recursive call
        }
        return search(arr, target, 0, mid - 1);    // recursive call
    }
}
