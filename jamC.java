import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


 
class Main{
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc=new Scanner(new FileReader("E:\\a.in"));
        PrintWriter pw=new PrintWriter(new FileWriter("E:\\ans.txt"));
       
   
         int t=sc.nextInt();
         
         for (int i = 1; i <= t; i++) {
            
             long n=sc.nextLong();
             long k=sc.nextLong();
             
             TreeMap<Long,Long> tm=new TreeMap();
             tm.put(n, 1L);
             
             while(!tm.isEmpty()){
                 long x=tm.lastKey();
                 long y=tm.remove(x);
                 
                
                 if(y>=k){
                     //System.out.println(y+" "+k);
                     pw.println("Case #"+i+": "+x/2+" "+(x-1)/2);
                     pw.flush();
                     break;
                 }
                 
                 if(x/2>0) {
                     if(tm.containsKey(x/2)){
                         tm.put(x/2, tm.get(x/2)+y);
                     }
                     else{
                         tm.put(x/2, y);
                     }
                 }
                 
                 if((x-1)/2>0){
                      if(tm.containsKey((x-1)/2)){
                         tm.put((x-1)/2, tm.get((x-1)/2)+y);
                     }
                     else{
                         tm.put((x-1)/2, y);
                     }
                 }
                 k-=y;
                 
             }
           
             
        }
        
        
        }
        
        
    }
   
