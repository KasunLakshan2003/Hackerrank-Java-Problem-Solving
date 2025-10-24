import java.util.Scanner;
public class Solution{
    public static void main(String[]args){
        Scanner myscanner=new Scanner(System.in);
        int n=myscanner.nextInt();
        int[] candles=new int[n];
        
        for(int i=0;i<n;i++){
            candles[i]=myscanner.nextInt();
             }
             int max=candles[0];
             for(int i: candles){
                if(i>max){
                    max=i;
                }
                
             }
             int count=0;
             for(int i : candles){
                if(i == max){
                    count++;
                }
             }System.out.println(count);
    }
}
