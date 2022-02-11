
// Print the no. from N to 1.

package Recursion.Easy;

public class PrintNto1 {

    public static void main(String[] args) {
        print(7);
    }

    static void print(int n){

        // base condition
        if(n==0){
            return;
        }
        System.out.println(n);
        //recursive call
        print(n-1);
    }
}
