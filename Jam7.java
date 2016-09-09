
package jam7;

import java.util.*;

public class Jam7 {

    boolean ok(String x,String y){
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!='?' && x.charAt(i)!=y.charAt(i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   Jam7 obj=new Jam7();
   while(t>0){
       String s1,s2;
       s1=sc.next();
       s2=sc.next();
       String a,b;
       int m=0;
       int opt=10000000;
       for(int i=1;i<=s1.length();i++){
           m=(m*10)+9;
       }
       String f1="",f2="";
       for(int i=0;i<=m;i++){
           for(int j=0;j<=m;j++){
               a=String.valueOf(i);
               b=String.valueOf(j);
               while(a.length()<s1.length()) a="0"+a;
               while(b.length()<s2.length()) b="0"+b;
               
               if(!obj.ok(s1,a)) continue;
               if(!obj.ok(s2,b)) continue;
               int jj=Integer.parseInt(a)-Integer.parseInt(b);
               while(Math.abs(jj)<opt){
                   opt=Math.abs(jj);
                   f1=a;
                   f2=b;
                   
               }
               
           }
       }
       System.out.println(f1+" "+f2);
       
       t--;
   }
        
    }
    
}
