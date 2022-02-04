package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {0,1,2,5,7,3,88,-1,-22,34};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){

        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    // swap
                    swap(arr, j, j-1);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
