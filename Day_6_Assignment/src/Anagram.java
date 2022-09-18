
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="pravendra";
		String s2="ardnevpar";
		
		if(isAnagram(s1,s2))
			System.out.println("Anagram");
		else
			System.out.print("Not Anagram");
	}
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		
		int a1[] = new int[26];
		int a2[] = new int[26];
		
		for(int i=0;i<s1.length();i++)
		{
			a1[s1.charAt(i)-97]++;
			a2[s2.charAt(i)-97]++;
		}
		
		for(int i=0;i<26;i++)
		{
			if(a1[i]!=a2[i])
				return false;
		}
		return true;
	}

}
