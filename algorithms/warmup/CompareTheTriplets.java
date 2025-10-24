import java.util.Scanner;
public class Solution{
    public static void main(String[]args){
        Scanner myscanner=new Scanner(System.in);
        
        int[] a=new int[3];
        int[] b=new int[3];
        
        for(int i=0;i<3; i++){
            a[i]=myscanner.nextInt();
        }
        for(int i=0;i<3; i++){
            b[i]=myscanner.nextInt();
        }
        int alice=0;
        int bob=0;
        
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                alice++;
            }else if(b[i]>a[i]){
                bob++;
            }
        }
        System.out.println(alice+" "+bob);
        
    }
}
