package InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1,4,6,2,0,-2,-4,-11,99,87};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {   // Or i <= arr.length - 2.. because we are using j+i , so if we use i < arr.length then..J will go outOfBound
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    // swap j with j-1
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
