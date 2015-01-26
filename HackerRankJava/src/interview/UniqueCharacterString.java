package interview;

public class UniqueCharacterString {

	public static void main(String[] args) {
		//System.out.println(isUniqueCharString("abcda"));
		//System.out.println(isUniqueChars("azzda"));
		System.out.println(Integer.toBinaryString(~0<<5));
		System.out.println(Integer.toBinaryString((1<<2)));
		
	}
	public static boolean isUniqueCharString(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(i!=s.lastIndexOf(s.charAt(i)))return false;
		}
		
		return true;
	}
	public static boolean isUniqueChars(String str){
		int checker = 0;
		for (int i=0; i < str.length(); i++) {
		int val = str.charAt(i) - 'a';
		System.out.println("value="+val);
		System.out.println("checker="+Integer.toBinaryString(checker));
		System.out.println(Integer.toBinaryString((1<<val)));
		if ((checker & (1<< val)) > 0) {
			return false;
			}
		//System.out.println("value="+Integer.toBinaryString(val));
			checker |= (1<< val);
			//System.out.println("checker="+Integer.toBinaryString(checker));
		}
			return true;
	}

}
