package test;
import java.util.*;
public class example {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your full name :");
		String fullname = sc.nextLine();
		if(!fullname.contains(" ")) {
			System.out.println("Incorrect name");
			return;
		}
		int spaceindex = fullname.indexOf(" ");
		String firstname = fullname.substring(0,spaceindex).toUpperCase();
		String lastname = fullname.substring(spaceindex,fullname.length()).toUpperCase();
		
		System.out.println("First name   "+  firstname);
		System.out.println("last name  " + lastname);
		
	

	}

}
