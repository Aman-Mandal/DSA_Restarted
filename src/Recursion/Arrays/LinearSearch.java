package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,3,5,7,12,-17,6};
        int target = 1;
        System.out.println(findIndex(arr,target,0));
        System.out.println(find(arr,target,0));
        System.out.println(findIndexLast(arr,target,arr.length-1));
        findAllIndex(arr, target, 0);
        System.out.println(list);
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


    // finding the last index ie. finding from the back side
    static int findIndexLast(int[] arr, int target, int index){

        // if index is -1 means element not found
        if (index == -1) {
            return -1;
        }
        else if(arr[index] == target){
            return index;
        }
        // check in the remaining array for the target
        else {
            return findIndexLast(arr, target, index - 1);
        }
    }


    // find all the index of the target
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex (int[] arr, int target, int index){

        if(index == arr.length){
            return;
        }
        // add the indexes in the list
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target, index + 1);
    }
}
