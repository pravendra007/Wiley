
public class Frequency {
	public static void main(String args[]) {
		String s="pravendra";
		int arr[] = new int[26];
		
		for(char c: s.toCharArray())
		{
			arr[c-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=0)
				System.out.println((char)(i+97)+": "+arr[i]);
		}
	}
}
