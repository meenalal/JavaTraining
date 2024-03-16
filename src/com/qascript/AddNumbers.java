package com.qascript;

public class AddNumbers {

    public static void main(String[] args) {
        addNumbers(4,5);
        addNumbers(9,1);
        addNumbers(9,7);

        int result = addNumbers(6,5);
        int output = result + 5;
        System.out.println("increment the output: " +output+1);
    }

    public static int addNumbers(int num1, int num2){
        int res = num1 + num2;
        System.out.println("Addition of 2 numbers: " + res);
        return res;

    }
}
