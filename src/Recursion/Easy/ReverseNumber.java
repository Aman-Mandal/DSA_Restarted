package Recursion.Easy;

public class ReverseNumber {

    public static void main(String[] args) {
        reverse1(123456);
        System.out.println(sum);
    }

    // global var
    static int sum = 0;
    static void reverse1(int n){

        // base
        if(n == 0){
            return;
        }
        int remainder = n % 10;
        sum = sum * 10 + remainder;

        // recursive call
        reverse1(n / 10);

    }
}
