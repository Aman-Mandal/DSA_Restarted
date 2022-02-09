
// A recursion consist of 2 things:
// 1. Base Condition
// 2. Recursive call


// linear recurrence relation - "Very slow"
package Recursion;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    static int fibo(int n){

        // base condition
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }

        // recursive call
        return fibo(n-1) + fibo(n-2);
    }
}
