
package probb;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Probb {

   
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new FileReader("F:\\a.in"));
       PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
       int t=sc.nextInt();
       for(int qq=1;qq<=t;qq++){
           int r=sc.nextInt();
           int c=sc.nextInt();
           int m=sc.nextInt();
           int[][] arr=new int[r+1][c+1];
           for(int i=0;i<=r;i++){
               for(int j=0;j<=c;j++){
                   arr[i][j]=0;
               }
           }
           for(int i=1;i<=m;i++){
               int x=sc.nextInt();
               int y=sc.nextInt();
               arr[x+1][y+1]=1;
           }
           int[] br=new int[3011];
           Arrays.fill(br, 0);
           for(int i=1;i<=r;i++){
               for(int j=1;j<=c;j++){
                   if(arr[i][j]==1) arr[i][j]=0;
                   else{
                       arr[i][j]=Math.min(Math.min(arr[i-1][j], arr[i][j-1]),arr[i-1][j-1])+1;
                       br[arr[i][j]]++;
                   }
                   
               }
           }
           long ans=0;
           long ans2=0;
           for(int i=1;i<=r;i++){
               for(int j=1;j<=c;j++){
                   ans=ans+arr[i][j];
               }
           }
           for(int i=3000;i>=1;i--){
               br[i]+=br[i+1];
               ans2+=br[i];
           }
         pw.println("Case #"+qq+": "+ans2+" "+ans);
           pw.flush();
       }
    }
    
}
