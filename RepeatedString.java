import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        long repetition = n / s.length();
        count = count * repetition;

        for(int i = 0; i < n % s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        String s = "aba";
        long n = 100000000;
        System.out.println("The amount of a's in the repeated string are: " + repeatedString(s, n));
    }
}
