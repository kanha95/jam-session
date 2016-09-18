
package proba;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Proba {
  int nxt[][]={{0,1},{1,0},{0,-1},{-1,0}};
   int r,c;
   double ans=0.0;
   double p,q;
String arr[][];
int[][] ar;
void go(int s,int x,int y,double res){
    if(s<0||x<0||y<0||x>=r||y>=c) return;
    
    if("A".equals(arr[x][y])) res+=Math.pow(1-p,ar[x][y])*p;
    else res+=Math.pow(1-q, ar[x][y])*q;
    
    
    if(s==0){
        ans=Math.max(ans,res);
    }
    
    ar[x][y]++;
    
    for(int i=0;i<=3;i++){
        go(s-1,x+nxt[i][0],y+nxt[i][1],res);
    }
    ar[x][y]--;
    
}

    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(new FileReader("F:\\a.in"));
       PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
       int t=sc.nextInt();
       Proba obj=new Proba();
       for(int qq=1;qq<=t;qq++){
             obj.r=sc.nextInt();
             obj.c=sc.nextInt();
             int x=sc.nextInt();
             int y=sc.nextInt();
             int s=sc.nextInt();
              obj.p=sc.nextDouble();
             obj.q=sc.nextDouble();
             obj.ar=new int[obj.r][obj.c];
             obj.arr=new String[obj.r][obj.c];
             for(int i=0;i<obj.r;i++){
                 for(int j=0;j<obj.c;j++){
                     obj.arr[i][j]=sc.next();
                 }
             }
            
             
             
             double res=0.0;
             for(int i=0;i<=3;i++){
             obj.go(s-1,x+obj.nxt[i][0],y+obj.nxt[i][1],res);
                     }
         
          
           
           pw.println("Case #"+qq+": "+obj.ans);
           pw.flush();
           obj.ans=0.0;
       }
       
    }
    
}
