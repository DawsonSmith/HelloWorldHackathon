import java.util.Scanner;
public class UserDatabase {
	long id = 0;
	String username;
	String password;
	public UserDatabase(){
		id++;
		username = "";
		password = "";
	}
	public UserDatabase(Scanner s) {
		id++;
		if(checkAvaliability()) {
			do {
			username = s.nextLine();
			if(username.length()<3){
				//TO BE IMPLEMETNED
			}
			}while(username.length()<3);
		}
		do {
		password = s.nextLine();
		if(password.length()<3){
			//TO BE IMPLEMETNED
		}
		}while(password.length()<3);
		//TO BE IMPLEMETNED - SHOULD INPUT THIS DATA INTO DATABASE
	}
	public static boolean checkAvaliability() {
		//TO BE IMPLEMENTED
		return true;
	}
	public boolean loginSuccess(){
		//if user and pass match, then return true
		//TO BE IMPLEMENTED
		return true;
	}
	public void logChanges() {
		//TO BE IMPLEMENTED
		//ADD ANY CHANGES TO WEIGHT, BODY FAT, ECT HERE
	}
}
