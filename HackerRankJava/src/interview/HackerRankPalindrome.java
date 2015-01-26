package interview;
import java.io.*;
public class HackerRankPalindrome {

	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String[] strings=new String[T];
		for(int i=0;i<T; i++)
		{
			strings[i]=br.readLine();
			
		}
		for(String s: strings)
		{
			int idx=-1;
			int low=0;
			int high=s.length()-1;
			while(low<high)
			{
				if(s.charAt(low)==s.charAt(high)){
					low++;high--;
					continue;
				}
				if(s.charAt(low+1)==s.charAt(high))
				{
					idx=low;
					break;
				}
				if(s.charAt(low)==s.charAt(high -1))
				{
					idx=high;
					break;
				}
				
			}
			System.out.println(idx);
		}
	}

}
