package lesson_03_statements;
import java.util.Scanner;
public class Tack_01_c {
	
	public enum HTPP_Error {
		Error400("Bad request Explained"),
		Error401("Unauthorized"),
		Error402("Payment Required");
		
		private String str;
		
		HTPP_Error(String str){
			this.str = str;
		}

		public String getStr() {
			return str;
		}		
	}
	public static void main (String [] args){
		
		System.out.println("Enter error number:");
		Scanner sc = new Scanner(System.in);
		int er = Integer.parseInt(sc.nextLine());
		sc.close();
		
		switch(er){
		case 400:
			System.out.println(HTPP_Error.Error400 + ": " + HTPP_Error.Error400.getStr());
			break;
		case 401:
			System.out.println(HTPP_Error.Error401 + ": " + HTPP_Error.Error401.getStr());
			break;
		case 402:
			System.out.println(HTPP_Error.Error402 + ": " + HTPP_Error.Error402.getStr());
			break;
		default:
			System.out.println("Not found error");
		}		
	}
}
