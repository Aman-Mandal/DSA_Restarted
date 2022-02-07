package Strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Am an Ma nd al";
        System.out.println(Arrays.toString(name.toCharArray()));        // Gives the array of characters
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("a"));
        System.out.println(name.indexOf('d'));
        System.out.println(Arrays.toString(name.getBytes(StandardCharsets.UTF_8)));
        System.out.println(name.hashCode());
        System.out.println("    Aman  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
