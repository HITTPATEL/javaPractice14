package day14.Q2;

import java.util.Scanner;

public class UserRegistration {
	String username;
	String userCountry;
	
	public void registerUser(String username,String userCountry) throws InvalidCountryException {
		  if(userCountry.equals("India")) {
			  System.out.println("User registration done successfully");
		  }
		  else {
			  InvalidCountryException invalidCountryException=new InvalidCountryException();
			  throw invalidCountryException;
		  }
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String nameString=scanner.next();
		
		System.out.println("Enter your Country");
		String countryString=scanner.next();
		
		UserRegistration userRegistration=new UserRegistration();
		try {
			userRegistration.registerUser(nameString, countryString);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println("User Outside India cannot be registered");
		}
	}
}
