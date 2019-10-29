import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribes = 0;
        for(int i = 0; i < q.length; i++){
            if(i - q[i] + 1 < -2){
                System.out.println("Too chaotic");
                return;
            }
            for(int j = Math.max(0, q[i] - 2); j < i; j++){
                if(q[j] > q[i]){
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }
    
    public static void main(String[] args) {
        int[] q = {2, 1, 5, 3, 4};
        System.out.println("The minimum number of bribes is for " + Arrays.toString(q) + " is:");
        minimumBribes(q);
    }
}
