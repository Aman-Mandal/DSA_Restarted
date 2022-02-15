package Recursion.Easy;

public class CountZeros {

    public static void main(String[] args) {
        int ans = count(2000202);
        System.out.println(ans);
    }

    static int count(int n){
        return helper(n, 0);
    }

    // helper function for finding count
    static int helper(int n, int count){

        // base
        if(n == 0){
            return count;
        }

        // getting the remainder
        int rem = n % 10;

        // recursive call
        if(rem == 0){
            return helper(n/10, count + 1);
        }
        return helper(n/10, count);
    }
}
