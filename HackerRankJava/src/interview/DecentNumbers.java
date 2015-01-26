package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecentNumbers {

	public static String decentNum(int N)
	{
		if(N==1||N==2||N==4)return "-1";
		if(N==3)return "555";
		if(N==5)return "33333";
		if(N%3==0)
		{
			
			
			//return StringUtils.repeat("5",N);
		}
		return decentNum(N-5)+"33333";
	}
	public static void main(String[] args)throws IOException {
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       	
	       int t=Integer.parseInt(br.readLine());
	       int[] testCases=new int[t];
	       
	       for(int i=0; i<t; i++)
	       {
	    	   testCases[i]=Integer.parseInt(br.readLine());
	       }
	       for(int s:testCases )
	       {
	    	  String str=decentNum(s);
	    	  if(!str.contains("-1")){
	    		  System.out.println(str);
	    		  
	    	  }
	    	  else System.out.println("-1");
	       }
	    }


}
