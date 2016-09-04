
package jam2;

import java.util.*;
import java.io.*;
public class Jam2 {

   

   void getmin(String s){
        int[] arr=new int[200];
       for(int j=0;j<=9;j++){
           arr[j]=0;
       }
       for(int k='a';k<='z';k++){
           
           arr[k]=0;
       }
       int value=0;
  for(int i=0;i<s.length();i++){
      if(arr[s.charAt(i)]==0){
          arr[s.charAt(i)]=++value;
         
      }
  }
  if(value<=1) value=2;
  int sum=0;
  for(int m=0;m<=s.length()-1;m++){
      int temp=arr[s.charAt(m)];
      if(temp==1){
          
      }else if(temp==2){
          temp=0;
      }else{
          temp--;
      }
      sum = sum*value + temp;
  }
  System.out.println(sum);
      
       
   }
    public static void main(String[] args) throws IOException {
            Scanner sc=new Scanner(new FileReader("F:\\a.in"));
            PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
            int t=sc.nextInt();
            String s;
              Jam2 obj;
            sc.nextLine();
            while(t>0){
              obj=new Jam2();
                s=sc.nextLine();
                obj.getmin(s);
                t--;
            }
    }
    
}
