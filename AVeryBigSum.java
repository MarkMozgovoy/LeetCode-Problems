import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AVeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args){
        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println("Sum of longs is: " + aVeryBigSum(ar));
    }
}
