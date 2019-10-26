import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArrayDS {

    
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = -9 * 7;//lowest possible given problem constraints
        for(int i = 1; i < arr.length - 1; i++){
            for(int j = 1; j < arr[i].length - 1; j++){
                int currentSum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i][j] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] arr = {
        		{1, 1, 1, 0, 0, 0},
        		{0, 1, 0, 0, 0, 0},
        		{1, 1, 1, 0, 0, 0},
        		{0, 0, 2, 4, 4, 0},
        		{0, 0, 0, 2, 0, 0},
        		{0, 0, 1, 2, 4, 0}
        };
        System.out.println("The maximum sum of an hourglass in arr is: " + hourglassSum(arr));
        
    }
}
