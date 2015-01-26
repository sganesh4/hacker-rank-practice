package interview;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankFibo {
    private static LinkedHashMap<Long, Integer> fibo= new LinkedHashMap<Long, Integer>();
    private static long a=0L, b=1L, c=0L;
    public static void initFibo(){
        fibo.put(0L, 0);
        fibo.put(1L, 0);
        for(int i=1; i<=30; i++)
        {
              fibo.put(a+b, 0);
              c=a+b;
              a=b;
              b=c;
        }
       
    }
    public static void checkFibo(long N)
    {
              if(fibo.containsKey(N))
              {
            	  System.out.println("IsFibo");
            	  return;
              }
             while((a+b)<=N)
             {
            	  c=a+b;
            	  fibo.put(c, 0);
            	  a=b;
            	  b=c;
            	  if(c==N)
            	  {
            		  System.out.println("IsFibo");
            	  }
             }
             System.out.println("IsNotFibo");
    }
    public static void main(String[] args)throws IOException {
       initFibo();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       long[] testCases=new long[t];
       for(int i=0; i<t; i++)
       {
    	   testCases[i]=Long.parseLong(br.readLine());
       }
       for(long l:testCases )
       {
    	   checkFibo(l);
       }
    }
}