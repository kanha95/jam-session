
package jam3;
import java.util.*;
import java.io.*;

public class Jam3 {
int[] arr;
boolean b=true;
int count=0;
    void check(int n,PrintWriter pw,int t){
        arr=new int[10];
        if(n==0){
           pw.println("Case #"+t+": INSOMNIA");
           pw.flush();
           return;
       }
       
        for(int i=0;i<=9;i++){
            arr[i]=0;
        }
        int x=1;
        
        while(b){
            test(x*n,pw,t);
            x++;
        }
        
       
    }
    void test(int n,PrintWriter pw,int t){
        int n1=n;
         while(n>0){
            int temp=n%10;
            if(arr[temp]==0){
            arr[temp]=1;
            count++;
            }
            if(count==10){
                pw.println("Case #"+t+": "+n1);
                b=false;
                pw.flush();
                break;
            }
            n=n/10;
        }
    }
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(new FileReader("F:\\a.in"));
            PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
            
            int t=sc.nextInt();
            int n;
            Jam3 obj=new Jam3();
            int mn=1;
            while(t>0){
                n=sc.nextInt();
                obj.check(n,pw,mn);
                obj.b=true;
                obj.count=0;
                mn++;
                t--;
            }
            pw.close();
            sc.close();
    }
    
}
