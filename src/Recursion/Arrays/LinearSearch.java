package Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,12,-17,6};
        int target = 1;
        System.out.println(findIndex(arr,target,0));
    }

    // using boolean
    static boolean find(int[] arr, int target, int index){

        // base condition
        // if array out of bound means element not found
        // because it has already checked the whole arr
        if (index == arr.length){
            return false;
        }

        // recursive call
        // if element at index is target , return true
        // OR
        // check in the remaining array from the next index
        return arr[index] == target || find(arr, target, index+1);
    }



    // finding the index value
    static int findIndex(int[] arr, int target, int index){

        // if index out of bound means element not found
        if (index == arr.length){
            return -1;
        }
        // if target found return the index value
        else if(arr[index] == target){
            return index;
        }
        // check in the remaining array for the target
        else {
            return findIndex(arr, target, index+1);
        }
    }
}
