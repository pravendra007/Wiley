package Stack_and_Queues;

import java.util.*;
public class Stack_and_Queues1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string containing curly braces");
		String s=sc.nextLine();
		
		boolean res=isValid(s);
		if(res)
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
	}
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(char ch: s.toCharArray()) {
			if(ch=='{')
				stack.push(ch);
			else
			{
				if(stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
}
