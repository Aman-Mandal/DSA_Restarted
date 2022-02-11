package Recursion.Easy;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    static int factorial(int n){

        // base statement
        if(n <= 1){
            return 1;
        }

        // recursive call
        return n * factorial(n-1);
    }
}
