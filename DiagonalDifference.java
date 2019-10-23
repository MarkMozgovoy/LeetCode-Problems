import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int difference;
        for(int i = 0; i < arr.size(); i++){
            primaryDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(arr.size() - i - 1).get(i);
        }

        difference = primaryDiagonal - secondaryDiagonal;
        if(difference < 0){
            difference = -1 * difference;
        }
        return difference;
    }
    
    public static void main(String[] args){
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(11);
        arr1.add(2);
        arr1.add(4);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(10);
        arr3.add(8);
        arr3.add(-12);
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);
        System.out.println("The diagonal difference is: " + diagonalDifference(arr));
    }
}
