
package prac1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Prac1 {

    
    int anst(String s1,String s2){
        int a=0;
        int b=s2.length();
        for(int i=0;i<s1.length();i++){
            a=a*b;
            a=a+s2.indexOf(s1.charAt(i));
        }
     
        return a;
    }
    String ansf(int n,String s3){
        String s="";
        int b=s3.length();
        while(n!=0){
            s=s+s3.charAt(n%b);
            n=n/b;
        }
        return s;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new FileReader("F:\\a.in"));
       PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
       int t=sc.nextInt();
       Prac1 obj=new Prac1();
       for(int qq=1;qq<=t;qq++){
           String s1,s2,s3;
           s1=sc.next();
           s2=sc.next();
           s3=sc.next();
           System.out.println("Case "+qq+": "+obj.ansf(obj.anst(s1,s2),s3));
       }
    }
    
}
