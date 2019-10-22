import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int currentCloud = 0;
        while(currentCloud < c.length){
            if(currentCloud + 2 < c.length && c[currentCloud + 2] != 1){
                currentCloud = currentCloud + 2;
                jumps++;
                continue;
            } else {
                if(currentCloud != c.length - 1){
                    currentCloud++;
                    jumps++;
                } else {
                    currentCloud++;
                }
            }
        }
        return jumps;
    }

    public static void main(String[] args) throws IOException {
        int[] example = {0, 1, 0, 0, 0, 1, 0};
        System.out.println("Min jumps required: " + jumpingOnClouds(example));
    }
}
