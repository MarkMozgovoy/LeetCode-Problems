import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        String longer = a;
        String shorter = b;
        if(b.length() > a.length()){
            longer = b;
            shorter = a;
        }
        int longerCounter = 0;
        for(int i = 0; i < longer.length(); i++){
            if(shorter.length() > 0){
                for(int j = 0; j < shorter.length(); j++){
                    if(longer.substring(i, i + 1).equals(shorter.substring(j, j+1))){
                        shorter = shorter.substring(0,j) + shorter.substring(j+1);
                        longerCounter++;
                        break;
                    }
                }
            }
            
        }

        return longer.length() - longerCounter + shorter.length();
    }

    public static void main(String[] args){
        String a = "cde";
        String b = "abc";
        System.out.println("The minimum deletions to create an anagram: " + makeAnagram(a, b));
    }
}
