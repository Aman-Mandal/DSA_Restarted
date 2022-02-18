package Recursion.Arrays;

import java.util.ArrayList;

public class ArrayListWithoutPassingArgs {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,5,5,9,5,0};
        int target = 5;
        System.out.println(findIndex2(arr,target,0));
    }

    static ArrayList<Integer> findIndex2 (int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
