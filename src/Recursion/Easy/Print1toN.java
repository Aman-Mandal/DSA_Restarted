package Recursion.Easy;

public class Print1toN {

    public static void main(String[] args) {
        fun(6);
    }

    /*
               We know that every fun will call another fun and wait in the stack.
               aso instead of printing the number after the function is called,
               we will print the number after when the function is over and about
               to return.
         */

    static void fun(int n){

        // base condition
        if(n == 0){
            return;
        }
        // recursive call
        fun(n-1);
        System.out.println(n);

    }
}
