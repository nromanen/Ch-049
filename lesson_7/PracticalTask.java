package lesson_7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] userName = new String[5];
		for(int i = 0; i < userName.length; i++){
			System.out.println("Enter user name");
			userName[i] = sc.nextLine();
		}
		sc.close();
		checkUserName(userName);
		}
	
	public static void checkUserName (String [] userName){
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
		for(int i = 0; i < userName.length; i++){
		Matcher m = p.matcher(userName[i]);
		System.out.println(m.matches());
		}		
		}
	}
