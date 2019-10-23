import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        double positiveRatio;
        double negativeRatio;
        double zeroesRatio;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positive++;
            } else if(arr[i] < 0){
                negative++;
            } else {
                zeroes++;
            }
        }
        positiveRatio = (double) positive / (double) arr.length;
        negativeRatio = (double) negative / (double) arr.length;
        zeroesRatio = (double) zeroes / (double) arr.length;
        DecimalFormat df = new DecimalFormat("#.000000");
        System.out.println(df.format(positiveRatio));
        System.out.println(df.format(negativeRatio));
        System.out.println(df.format(zeroesRatio));
    }

    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        System.out.println("The ratios of positives, negatives, and zeroes, respectively: ");
        plusMinus(arr);
    }
}
