package com.qascript;

public class ModifyString {

    public static void main(String[] args) {
        String s1 = "Learing Java";
        String s2 = "Basics";

        System.out.println("Length of the string is: "+ s1.length());
        System.out.println("Upper Case String: "+ s1.toUpperCase());
        System.out.println("Lower Case String: "+ s1.toLowerCase());
        System.out.println("Get Char: "+ s1.indexOf("n"));
        System.out.println("Get position: "+ s1.charAt(3));
    }
}
