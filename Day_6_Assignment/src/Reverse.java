
public class Reverse {
	public static void main(String args[])
	{
		String s="Pravendra";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res+=s.charAt(i);
		}
		System.out.println(res);
	}
}
