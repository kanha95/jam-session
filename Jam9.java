
package jam9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Jam9 {

 int solve(int n){
     if((n & (n-1))==0 ) return 0;
     int a=1;
     while(n>=a){
         a=a<<1;
     }
     return 1^solve(a-n);
 }
   
    public static void main(String[] args)throws IOException {
     Scanner sc=new Scanner(new FileReader("F:\\a.in"));
     PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
     int t=sc.nextInt();
     Jam9 obj=new Jam9();int kk=1;
     while(t>0){
           int n=sc.nextInt();
           int m=obj.solve(n);
         pw.println("Case #"+kk+": "+m);
         
         pw.flush();
         kk++;
         t--;
     }
    }
    
}
