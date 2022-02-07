package Strings;

/*
        We know Strings are immutable i.e we cannot change the value by another reference variable.
        So if we want to add a character in a particular string like the below function, the String class creates
        new string every time after adding a char.. so all the previous character were taking too much memory .

        Thats why StringBuilder Datastructure is created. We can change the strings in this DS. similar to the ArrayList.
 */
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
