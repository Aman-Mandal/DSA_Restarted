package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5,8,9,0,1,6,11};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){

        boolean isSwapped;
        // for the ith iteration
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            // for the j pointer on the element to be swapped
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
}
