package Recursion.Easy;

/*
        we know that number % 10 gives the last digit
        and number / 10 gives the number excluding the last digit
        so,
        we will separate the digits and add them
 */
public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(-546324));
    }

    static int sumOfDigits(int n){

        // base condition
        if(n == 0){
            return 0;
        }

        // recursive call
        return (n % 10) + sumOfDigits(n / 10);
    }
}
