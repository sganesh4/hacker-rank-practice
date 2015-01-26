package interview;

import java.util.*;

public class PermuteString {
	private static Set<String> permutes = new TreeSet<String>();
	private static void permute(String pre, String post)
	{
		//if(post.length()==0)
			permutes.add(pre);
			for (int i = 0; i < post.length(); i++) {
				permute(pre+post.charAt(i), post.substring(0, i)+post.substring(i+1, post.length()));
			}
	}
	public static void main(String[] args) {
		permute("","abc");
		System.out.println(permutes);
		
	}

}
