package Recursion.Arrays;

import java.util.ArrayList;

public class ArrayListLS {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,5,5,9,5,0};
        int target = 5;
        System.out.println(list(arr, target, 0,new ArrayList<>()));

    }

    // ArrayList function
    // return all the indexes in the list
    static ArrayList<Integer> list(int[] arr, int target, int index, ArrayList<Integer> list){

        if (index == arr.length){
            return list;
        }
        else if(arr[index] == target){
            list.add(index);
        }
        return list(arr, target, index+1, list);
    }
}
