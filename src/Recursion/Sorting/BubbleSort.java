package Recursion.Sorting;

import java.util.Arrays;

// refer to the triangle1 - recursion question

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4,6,2,7,1,0,9};
        bubble(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){

            // if element is greater than the next element .. swap
            if (arr[col] > arr[col+1]){
                swap(arr,col,col+1);
            }

            // recursive call
            bubble(arr,row,col+1);
        }
        else{
            bubble(arr,row-1,0);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
