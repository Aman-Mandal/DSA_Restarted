package LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {1,2,5,78,90,87,0,-2};
        int target = 90;

        int ans = linearSearch2(arr,target);
        System.out.println(ans);
    }

    // Returning the index
    static int linearSearch(int[] arr, int target){
        // if arr is empty return -1;
        if (arr.length == 0){
            return -1;
        }
        // for loop
        for (int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    
    // Returning the element
    static int linearSearch2(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        for (int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}
