import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int deletions = 0;
        if(s.length() == 1){
            return 0;
        }
        for(int i = 1; i < s.length(); i++){
            if(s.substring(i, i+1).equals(s.substring(i-1, i))){
                deletions++;
            }
        }
        return deletions;
    }

    public static void main(String[] args){
        String sample = "AAAAAAAAABBBBAAAAA";
        System.out.println("Sample String: " + sample);
        System.out.println("The minimum amount of deletions to remove all adjacent, similar characters is: " + alternatingCharacters(sample));
    }
}