package Recursion.Arrays;

public class CheckIfSortedOrNot {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 34, 9, 11};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr, int index){

        // base condition
        // if pointer is on the last index so the array is sorted
        if(index == arr.length - 1){
            return true;
        }

        // recursive call
        // if element at "i" is smaller than "i+1" check the remaining arr.
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
