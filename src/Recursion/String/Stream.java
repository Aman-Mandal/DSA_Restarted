package Recursion.String;

// Print a string removing all the 'a' from it

public class Stream {

    public static void main(String[] args) {
        System.out.println(skip("aaaabbbccccamandefaaa"));
    }

    // Passing ans in the argument
    static void skip(String ans, String givenString){

        // if given string is empty
        if(givenString.isEmpty()){
            System.out.println(ans);
            return;
        }

        // check if the first char is 'a'
        char ch = givenString.charAt(0);
        if (ch == 'a'){
            // removing the first character
            skip(ans,givenString.substring(1));
        }
        // if 'a' is not the first char, add it to the ans arr
        else {
            skip(ans + ch ,givenString.substring(1));
        }
    }


    // without passing ans in argument
    static String skip(String givenString){

        // if string becomes empty, return empty string
        if(givenString.isEmpty()){
            return "";
        }

        char ch = givenString.charAt(0);
        if(ch == 'a'){
            // if char is 'a' skip a and start searching from the next char
            return skip(skip(givenString.substring(1)));
        }
        else{
            // if char is not 'a' add the char to the ans
            return ch + skip(givenString.substring(1));
        }
    }
}
