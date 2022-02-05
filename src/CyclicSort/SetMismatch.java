package CyclicSort;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {

        int i = 0;
        int n = nums.length;

        while(i < n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if(nums[index] != index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
