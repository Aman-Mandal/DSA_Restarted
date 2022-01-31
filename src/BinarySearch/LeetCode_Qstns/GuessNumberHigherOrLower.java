package BinarySearch.LeetCode_Qstns;
// https://leetcode.com/problems/guess-number-higher-or-lower/

// There's an API in LeetCode for this question we have to implement that

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {

    }
    int guessNumber(int n){
        int start = 1;
        int end = n;

        while (start <= end){
            int mid = start + (end - start)/ 2;
            int guess = guess(mid);

            if(guess == 1){
                start = mid + 1;
            }
            else if(guess == -1){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
