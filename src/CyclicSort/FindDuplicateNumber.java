package CyclicSort;

public class FindDuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {

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

        for(int index = 0; index < n; index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }
    return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;


    }
}
