package Strings.Leetcode;

public class DefangingAnIPAddress {

    public static void main(String[] args) {
        String add = "1.1.1.1";
        System.out.println(defangIPaddr(add));
    }

    public static String defangIPaddr(String address) {

        return address.replace("." , "[.]");
    }
}
