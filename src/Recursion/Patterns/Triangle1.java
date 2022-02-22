package Recursion.Patterns;

/*

       5 * * * * *
       4 * * * *
       3 * * *
       2 * *
       1 *

 */
public class Triangle1 {

    public static void main(String[] args) {
        triangle(5,0);
    }

    static void triangle(int row, int col){

        if(row == 0){
            return;
        }
        // if col is less than the no. of row(stars in row)
        // print the star
        if(col < row){
            System.out.print("* ");
            // recursive call for increasing col and print star
            triangle(row, col+1);
        }
        //if col is greater than row
        // new line and decrease a star by 1
        else{
            System.out.println();
            triangle(row-1,0);
        }
    }
}
