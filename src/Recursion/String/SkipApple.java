package Recursion.String;

public class SkipApple {

    public static void main(String[] args) {
        System.out.println(skipApple("kjdapplenafnanapplenvna"));
    }

    static String skipApple(String givenString){

        if (givenString.isEmpty()){
            return "";
        }

        // if string starts with apple skip it
        if (givenString.startsWith("apple")){
            return skipApple(givenString.substring(5));
        }
        else{
            // return the first char , and search in the remaining string
            return givenString.charAt(0) + skipApple(givenString.substring(1));
        }
    }
}
