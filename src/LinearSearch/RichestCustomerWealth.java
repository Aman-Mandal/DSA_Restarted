package LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{3,2,1}};
        int ans = maximumWealth(arr);
        System.out.println(ans);

    }

    public static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int row= 0; row < accounts.length ; row++) {
            int rowSum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                rowSum += accounts[row][col];
            }

            if(rowSum > ans){
                ans = rowSum;
            }
        }
        return ans;
    }

}
