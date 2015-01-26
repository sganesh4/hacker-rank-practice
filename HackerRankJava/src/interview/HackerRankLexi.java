package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class HackerRankLexi {
	public static void lexi(String str)
	{
		String lexiNext=null;
		char[] c=str.toCharArray();
		ArrayList<Character> cs =new ArrayList<Character>();
		char temp;
		//cs.add(c[str.length()-1]);
		for(int i=str.length()-1; i>=1; i-- ){
			if(str.charAt(i) <= str.charAt(i-1)){
				cs.add(c[i]);
			continue;
			}
			else
			{
				int ctr=0;
				cs.add(c[i]);
				//System.out.println(cs);
				cs.add(c[i-1]);
				Collections.sort(cs);
				for(Character ch:cs)
				
				{
					if(ch>c[i-1])
					{
						c[i-1]=ch;
						cs.remove(ch);
						break;
					}
				}
				
				for(int j=i; j<str.length(); j++)
				{
					c[j]=cs.get(ctr++);
				}
				lexiNext =new String(c);
				System.out.println(lexiNext);
				return;
			}
			
		}
		
		System.out.println("no answer");
	}
	public static void main(String[] args)throws IOException {
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       int t=Integer.parseInt(br.readLine());
	       String[] testCases=new String[t];
	       for(int i=0; i<t; i++)
	       {
	    	   testCases[i]=br.readLine();
	       }
	       for(String s:testCases )
	       {
	    	  lexi(s);
	       }
	    }

}
