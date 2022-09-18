import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String args[]) {
		String email="Prav@endra54321@gmail.com";
		System.out.println("Entered email address: "+email);
		try {
			boolean isValid=checkValidity(email);
			if(isValid)
			System.out.println("Your email address is valid");	
		}
		catch(InvalidEmailException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static boolean checkValidity(String email) throws InvalidEmailException {
		Pattern regex = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
		Matcher m = regex.matcher(email);
		if(m.find()==false)
			throw new InvalidEmailException("Your email address is invalid");
		return true;
	}
}
