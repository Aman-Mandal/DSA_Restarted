package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {0,98,78,-1,-45,-789,8989,18};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = 0; i <= last ; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
