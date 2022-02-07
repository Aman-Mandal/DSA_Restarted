package Strings;

// Basic Lecture on String

public class PrettyPrinting {

    public static void main(String[] args) {
//        String name = "Aman";
//        System.out.println(name);
//        System.out.println(name.charAt(1));

//        Prints the 2 nums after the decimal

        float a = 12323.343534f;
        System.out.printf("Formatted Number : %.2f",a);


//         Operators

//         Gives the Ascii value
        System.out.println('a' + 'b');

//        Concatenate
        System.out.println("a" + "b");

//        Casting
        System.out.println((char)('a' + 3));  // returns 'd'

//        Same as Concatenation
        System.out.println("a" + 1);

    }
}
