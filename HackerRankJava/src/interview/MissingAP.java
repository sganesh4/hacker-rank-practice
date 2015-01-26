package interview;
import java.io.*;
import java.util.*;
public class MissingAP {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       	
	       int N=Integer.parseInt(br.readLine());
	       String numString = br.readLine();
	       Scanner read = new Scanner(numString);
	       int[] testCases = new int[N];
	       int sum = 0;
	       for(int i=0; i<N; i++)
	       {
	    	   testCases[i]=read.nextInt();
	    	   sum+=testCases[i];
	       }
	       int realSum = (N+1)*(testCases[0]+testCases[N-1])/2;
	       System.out.println(realSum-sum);
	      
	}

}
