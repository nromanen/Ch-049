package sevenLTask;

import java.util.ArrayList;
import java.util.List;

public class PT3UserName {

	public static void main(String[] args) {
		int counter = 0;
		List <String> str = new ArrayList <String>();
		str.add("Kid");
		str.add("Wish");
		str.add("Smetana");
		str.add("666_Kid-Pres");
		str.add("Alisher666");
		
		PT3MatchTheUserName match = new PT3MatchTheUserName();
		for (String s : str) {
			//match.setUserName(s);
			if (match.matchTheUserName(s)){
				System.out.println(counter + " user name is match our pattern.");
				counter++;
				
			}
			
		}
		
	}

}
