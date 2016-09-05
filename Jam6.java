
package jam6;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Jam6 {

    
    public static void main(String[] args) throws IOException {
    Scanner sc=new Scanner(new FileReader("F:\\a.in"));
            PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
  int t=sc.nextInt();
  sc.nextLine();
  int yu=1;
  while(t>0){
     
      ArrayList ar=new ArrayList();
      
      
      String s=sc.nextLine();
      int i=0;
      while(s.length()!=0 && i<s.length()){
          if(s.charAt(i)=='Z'){
              s=s.replaceFirst("Z", "");
              s=s.replaceFirst("E", "");
               s=s.replaceFirst("R", "");
                s=s.replaceFirst("O", "");
                ar.add(0);
               
                i=0;
              
              
          }
          else if(s.charAt(i)=='W'){
              s=s.replaceFirst("W", "");
               s=s.replaceFirst("T", "");
               s=s.replaceFirst("O", "");
              
                ar.add(2);
                i=0;
               
               
          }
          else if(s.charAt(i)=='U'){
              s=s.replaceFirst("U", "");
              s=s.replaceFirst("F", "");
               s=s.replaceFirst("O", "");
               s=s.replaceFirst("R", "");
               
               i=0;
               ar.add(4);
               
          }
           else if(s.charAt(i)=='X'){
               s=s.replaceFirst("X", "");
              s=s.replaceFirst("S", "");
               s=s.replaceFirst("I", "");
              
               i=0;
               ar.add(6);
               
              
          }
            else if(s.charAt(i)=='G'){
                s=s.replaceFirst("G", "");
              s=s.replaceFirst("E", "");
               s=s.replaceFirst("I", "");
                s=s.replaceFirst("H", "");
               s=s.replaceFirst("T", "");
               ar.add(8);
              
               i=0;
                
          }else{
                i++;
            }
          
      }
      int j=0;
      while(s.length()!=0 && j<s.length()){
           if(s.charAt(j)=='H'){
               s=s.replaceFirst("H", "");
              s=s.replaceFirst("T", "");
               s=s.replaceFirst("R", "");
                s=s.replaceFirst("E", "");
               s=s.replaceFirst("E", "");
              ar.add(3);
              
               j=0;
              
          }
           else if(s.charAt(j)=='O'){
               s=s.replaceFirst("O", "");
              s=s.replaceFirst("N", "");
               s=s.replaceFirst("E", "");
               
               
            ar.add(1);
               
                j=0;
          }
            else if(s.charAt(j)=='F'){
                s=s.replaceFirst("F", "");
              s=s.replaceFirst("I", "");
               s=s.replaceFirst("E", "");
                s=s.replaceFirst("V", "");
             
            
                ar.add(5);
                        j=0;
                
          }
            
             else if(s.charAt(j)=='S'){
                 s=s.replaceFirst("S", "");
              s=s.replaceFirst("E", "");
               s=s.replaceFirst("V", "");
                s=s.replaceFirst("E", "");
                s=s.replaceFirst("N", "");
            
               
                ar.add(7);
                j=0;
                
          }
             else{
                 j++;
             }
           
      }
      int k=0;
      while(s.length()!=0 && k<s.length()){
          if(s.charAt(k)=='N'){
              s=s.replaceFirst("N", "");
               s=s.replaceFirst("I", "");
                s=s.replaceFirst("N", "");
                s=s.replaceFirst("E", "");
               
               
                ar.add(9);
                k=0;
                
          }else{
              k++;
          }
      }
      Collections.sort(ar);  
Iterator itr=ar.iterator();  
pw.print("Case #"+yu+": ");
while(itr.hasNext()){  
pw.print(itr.next());
}
yu++;
pw.println();
pw.flush();
      t--;
  }
  pw.close();
  
       
    
}
}