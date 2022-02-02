package BinarySearch.LeetCode_Qstns;

/*

        Wrong !!!
         ||
         ||
        \  /
         \/

*/

public class NAndItsDoubleExist {

    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(search(arr));
    }

    static boolean search(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if((arr[mid]*2 == arr[end]) || (arr[mid]*2 == arr[start])){
                return true;
            }
            else if(arr[start]*2 == arr[end] || arr[start]*2 == arr[mid]){
                return true;
            }
            else if(arr[end]*2 == arr[start] || arr[end]*2 == arr[mid]){
                return true;
            }
            else{
                start++;
                end--;
            }
        }
        return false;
    }
}
