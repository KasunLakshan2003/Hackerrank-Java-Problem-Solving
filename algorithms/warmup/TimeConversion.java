import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String[] str=s.split(":");
        int hour = Integer.parseInt(str[0]);
        
        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0,secPeriod.length()-2);
        String period = str[2].substring(secPeriod.length()-2,secPeriod.length());
        
        String newTimeINString="";
        
        if ((0<=hour && 12>hour)&&(period.equalsIgnoreCase("AM"))){
            newTimeINString=String.format("%02d",hour)+":"+min+":"+sec;
           
        }else if ((0<=hour && 12>hour)&&(period.equalsIgnoreCase("PM"))){
            newTimeINString=(12+hour)+":"+min+":"+sec;
            
        }else if ((hour==12)&& (period.equalsIgnoreCase("AM"))){
            newTimeINString=String.format("%02d",(hour-12))+":"+min+":"+sec;
          
        }else if ((hour==12)&& (period.equalsIgnoreCase("PM"))){
            newTimeINString=hour+":"+min+":"+sec;
            
        }return newTimeINString;
        
    } }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
