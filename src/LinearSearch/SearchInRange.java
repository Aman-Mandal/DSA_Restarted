package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,9,9,-1,98,8,-11};
        int target = 6;
        System.out.println(searchInRange(arr, target, 2, 9));
    }

    static int searchInRange(int[] arr, int target, int start, int end){

        for(int i = start; i <= end; i++){
            if(arr.length==0){
                return -1;
            }
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }
}
