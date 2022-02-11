package Recursion.Easy;

public class ProductOfDigits {

    public static void main(String[] args) {
        System.out.println(productOfDigits(2678));
    }

    static int productOfDigits(int n){

        // base
        if(n%10 == n){
            return n;
        }

        // recursive call
        return (n % 10) * productOfDigits(n/10);
    }
}
