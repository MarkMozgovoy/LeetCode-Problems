import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraysLeftRotation {
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int actualRotations = d % a.length;
        int[] returnArray = new int[a.length];
        for(int i = actualRotations; i < a.length; i++){
            returnArray[i - actualRotations] = a[i];
        }
        if(actualRotations != 0){
            for(int i = 0; i < actualRotations; i++){
                returnArray[a.length - actualRotations + i] = a[i];
            }
        }
        return returnArray;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int leftRotations = 4;
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Left rotations: " + leftRotations);
        System.out.println("Result: " + Arrays.toString(rotLeft(arr, leftRotations)));
    }
}
