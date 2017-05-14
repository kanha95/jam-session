import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
 
class pair implements Comparable<pair>{
    int r,h;
    pair(int r,int h){
        this.r=r;
        this.h=h;
      
    }
    
    public int compareTo(pair that){
        return Integer.compare(this.h, that.h);
    }
    
}
class Main{
 

 	
    public static void main(String[] args) throws IOException{
        
             InputReader sc=new InputReader(System.in);
           //  PrintWriter pw=new PrintWriter(new FileWriter("E:\\a.txt"));
             
         int t=sc.nextInt();
         
         for (int yy = 1; yy <= t; yy++) {
            
             int n=sc.nextInt();
             int k=sc.nextInt();
             
             double ans=0.0;
             
             pair[] p=new pair[n];
             
             for (int i = 0; i < n; i++) {
                 int r=sc.nextInt();
                 int h=sc.nextInt();
              
                 p[i]=new pair(r,h); 
             }
             
             for (int i = 0; i < n; i++) {
               ArrayList<Double> al=new ArrayList<>();
               double val=Math.PI*p[i].r*p[i].r+Math.PI*2*p[i].r*p[i].h;
                 for (int j = 0; j < n; j++) {
                     if(i!=j && p[j].r<=p[i].r){
                         al.add(Math.PI*2*p[j].r*p[j].h);
                     }
                 }
                 if(al.size()<k-1) continue;
                 
                 Collections.sort(al,Collections.reverseOrder());
                 
                 for (int j = 0; j < k-1; j++) {
                     val+=al.get(j);
                 }
                 ans=Math.max(ans, val);
                 
             }
             
             System.out.println(ans);
             
        }
         
          
            
           
           
           
           
           
           
           
           
           
           
           //end here
           } 
        }
        
        
 
        
  
 class InputReader
	{
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		
		public InputReader(InputStream stream)
		{
			this.stream = stream;
		}
		
		public int read()
		{
			if (numChars==-1) 
				throw new InputMismatchException();
			
			if (curChar >= numChars)
			{
				curChar = 0;
				try 
				{
					numChars = stream.read(buf);
				}
				catch (IOException e)
				{
					throw new InputMismatchException();
				}
				
				if(numChars <= 0)				
					return -1;
			}
			return buf[curChar++];
		}
	 
		public String nextLine()
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
		}
		public int nextInt()
		{
			int c = read();
			
			while(isSpaceChar(c)) 
				c = read();
			
			int sgn = 1;
			
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			
			int res = 0;
			do 
			{
				if(c<'0'||c>'9') 
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c)); 
			
			return res * sgn;
		}
		
		public long nextLong() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			long res = 0;
			
			do 
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c));
				return res * sgn;
		}
		
		public double nextDouble() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') 
			{
				if (c == 'e' || c == 'E')
					return res * Math.pow(10, nextInt());
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') 
			{
				c = read();
				double m = 1;
				while (!isSpaceChar(c)) 
				{
					if (c == 'e' || c == 'E')
						return res * Math.pow(10, nextInt());
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}
		
		public String readString() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do 
			{
				res.appendCodePoint(c);
				c = read();
			} 
			while (!isSpaceChar(c));
			
			return res.toString();
		}
	 
		public boolean isSpaceChar(int c) 
		{
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	 
		public String next() 
		{
			return readString();
		}
		
		public interface SpaceCharFilter 
		{
			public boolean isSpaceChar(int ch);
		}
	}   
