package com.qascript;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int arr[] = {2,10,7,8,1};
        int arr2[] = {4, 6, 5, 0};
        Arrays.sort(arr);
        System.out.println("Length of the array is: " + arr.length);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        if(arr.equals(arr2)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
