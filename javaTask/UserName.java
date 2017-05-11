package javaTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {
	public boolean isValid (String text){
		//String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
		String pattern = "\\w{3,15}";
		//String text = "my.mail@ua.Ua";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		return m.matches();
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
		String text = "my.mail@ua.Ua";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		System.out.println(m.matches());
*/
		System.out.println(new UserName().isValid("my.sdafas@dasfasd.fds"));
		System.out.println(new UserName().isValid("abs"));
		

	}

}
