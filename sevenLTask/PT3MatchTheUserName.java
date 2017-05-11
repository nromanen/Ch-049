package sevenLTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PT3MatchTheUserName {
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean matchTheUserName(String userName) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9-_]{3,15}$");
		Matcher m = p.matcher(userName);
		return m.matches();
	}

}
