package LinearSearch;

public class MinNumberInArr {
    public static void main(String[] args) {
        int[] arr ={1,5,6,0,-1,-3,89};
        System.out.println(minNumber(arr));
    }

    static int minNumber(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}