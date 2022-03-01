package BinarySearch.LeetCode_Qstns;

public class CountNegativesIn2D {

    public static void main(String[] args) {

        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-2},
                {1,1,-1,-4},
                {-1,-1,-3,-5}
        };
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {

        // count for negatives in each row
        int ans = 0;
        for (int i = 0; i < grid.length; ++i) {

            // add all the counts of all rows
            ans += rowNegatives(grid[i]);
        }
        return ans;
    }

    // finding count of negatives in each row
    static int rowNegatives(int[] row){
        int start = 0;
        int end = row.length - 1;
        int result = 0;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(row[mid] > 0){
                start = mid + 1;
            }
            else if(row[mid] < 0){

                // counting all the elements from mid+1 to end ... because if mid is negative
                // then all the remaining elements are also negative
                result += end - mid+1;
                end = mid - 1;
            }
        }
        // return the count of negatives in row
        return result;
    }
}
