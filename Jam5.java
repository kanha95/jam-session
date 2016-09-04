
package jam5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Jam5 {

   
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(new FileReader("F:\\a.in"));
            PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
            
            Jam5 obj=new Jam5();
            int t=sc.nextInt();
            int n;
            int mo=t;
          
            while(t>0){
                n=sc.nextInt();
                 int[] as=new int[2501];
             for(int j=0;j<2501;j++){
                as[j]=0;
             }
                for(int i=0;i<n*(2*n-1);i++){
                    int ju=sc.nextInt();
                    
                        as[ju]^=1;
                    
                    
                }
                pw.print("Case #"+(mo-t+1)+": ");
                for(int k=0;k<=2500;k++){
                     
                    if(as[k]==1){
                       pw.print(k+" ");
                    }
                }   pw.println();
                pw.flush();
                
                t--;
            }
                
    }
    
}
