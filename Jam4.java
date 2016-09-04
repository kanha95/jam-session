
package jam4;

import java.util.*;
import java.io.*;
public class Jam4 {
String st="";
     void check(String s,PrintWriter pw,int t){
         int temp;
         st=st+s.charAt(0);
         temp=s.charAt(0);
         for(int i=1;i<s.length();i++){
         if(temp<=s.charAt(i)){
             st=s.charAt(i)+st;
             temp=s.charAt(i);
         }
         else{
             st=st+s.charAt(i);
         }
         
     }
         pw.println("Case #"+t+": "+st);
         pw.flush();
         st="";
     }

   
 public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(new FileReader("F:\\a.in"));     
            PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
            Jam4 obj=new Jam4();
            int t=sc.nextInt();
            String s;
            sc.nextLine();
            int mn=1;
            while(t>0){
                s=sc.nextLine();
                obj.check(s,pw,mn);
                mn++;
                t--;
                
                
            }
        pw.close();
    }
    
}
