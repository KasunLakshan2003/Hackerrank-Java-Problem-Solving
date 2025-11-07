import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'serviceLane' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY cases
     */

    public static List<Integer> serviceLane(List <Integer> width, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<>();//aray to store minWidth
        
        for(List<Integer> range : cases){//go thrugh each case
            int start = range.get(0);
            int end = range.get(1);
            int minWidth = Integer.MAX_VALUE;
            
            for(int i = start ; i <= end ; i++){//checking minWidth
                minWidth = Math.min(minWidth, width.get(i));
            }result.add(minWidth);
        }return result;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] widthTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> width = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthTemp[i]);
            width.add(widthItem);
        }

        List<List<Integer>> cases = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String[] casesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> casesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowTempItems[j]);
                casesRowItems.add(casesItem);
            }

            cases.add(casesRowItems);
        }

        List<Integer> result = Result.serviceLane(width, cases);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
