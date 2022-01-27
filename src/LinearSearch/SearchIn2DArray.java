package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {4,7,90,8},
                {2,33,56,0},
                {222,-9}
        };
        int target = -7;
        int ans[] = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    // Searching in 2D Arrays
    static int[] search(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Maximum in 2D array
    static int max(int[][]arr){
        int maxValue = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > maxValue){
                    maxValue = arr[row][col];
                }
            }
        }
        return maxValue;
    }

    // Minimum in 2D array
    static int min(int[][]arr){
        int minValue = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] < minValue){
                    minValue = arr[row][col];
                }
            }
        }
        return minValue;
    }

}
