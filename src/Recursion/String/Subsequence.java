package Recursion.String;

// Subsequence is creating the subsets of String.

public class Subsequence {
    public static void main(String[] args) {
        subseq("","abc");
    }
    static void subseq(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        // Add it
        subseq(ch + p, up.substring(1));
        // Ignore it
        subseq(p, up.substring(1));
    }
}
