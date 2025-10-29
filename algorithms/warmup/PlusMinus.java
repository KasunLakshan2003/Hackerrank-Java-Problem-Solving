import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    
    int len = arr.size();
    float positive_count = 0;
    float negative_count = 0;
    float zero_count = 0;

    for (int i = 0; i < len; i++) {
        int element = arr.get(i);
        if (element < 0) negative_count++;
        else if (element == 0) zero_count++;
        else positive_count++;
    }

    System.out.printf("%.6f%n", positive_count / len);
    System.out.printf("%.6f%n", negative_count / len);
    System.out.printf("%.6f%n", zero_count / len);
}
    // Write your code here

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
