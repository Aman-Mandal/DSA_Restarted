
// A function that calls itself is called as Recursion.

// Base Condition : Condition where our recursion will stop making new calls.
// Recursive call : If you are calling a function again and again, you can treat it as a separate call in the stack
package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){

        // base condition
        if(n == 5){
            System.out.println(5);
            return;
        }

        // Printing the number
        System.out.println(n);

        // recursive call
        // tail recursion
        print(n+1);
    }

}
