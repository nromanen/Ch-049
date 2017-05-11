package javaTask;

public class TwoStrings {
	public static void main(String[]args){
	String s1 = "IT";
	String s2 = "IT Academy";
	
	if (s2.contains(s1)){
		System.out.println(s2 + " contains " + s1);
	}
	else{
		System.out.println(s2 + " doesn't contains " +s2);
	}
}
}