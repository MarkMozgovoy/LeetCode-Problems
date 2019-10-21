import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleys = 0;
        int currentElevation = 0;
        boolean inValley = false;
        for(int i = 0; i < n; i++){
            if(s.substring(i, i + 1).equals("U")){
                currentElevation++;
            }
            if(s.substring(i, i + 1).equals("D")){
                currentElevation--;
            }

            if(currentElevation == -1 && inValley == false){
                inValley = true;
            }
            if(currentElevation == 0 && inValley == true){
                inValley = false;
                valleys++;
            }
        }
        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String s = "UDDDUDUU";
        int n = s.length();
        int result = countingValleys(n, s);
        System.out.println("Expected Result: 1");
        System.out.println("Actual result: " + result);
    }
}
