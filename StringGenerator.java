/**
	This program contains two static methods, to generate acronyms or passwords.
	@author Haniya Ahmed #3675130
*/

import java.util.Scanner;
public class StringGenerator
{

	/**
		This method generates an acronym based on text input.
		@param text
		@return the acronym generated.
	*/
	public static String generateAcronym(String text) 
	{
	String acronym = "";
	Scanner scan = new Scanner(text);
	while (scan.hasNext())
	  {
		if(scan.hasNextDouble())
		  acronym += scan.next();

		else{
		  String word = scan.next();
		  if(Character.isUpperCase(word.charAt(0)))
		  {
			acronym += word.charAt(0);
		  }
		}
	  }
	
		return acronym;
	
	}	
	
	/**
		This method generates a password based on text input.
		@param text
		@return the password
	*/
	public static String generatePassword(String text)
	{
		String password = "";
		Scanner scan = new Scanner(text);

		String word;
	        boolean state = true;
		int counter = 0;
		
	
		while(scan.hasNext())
		{
		  word = scan.next();
		  
		  if (word.length() >= 3)
		  {
	
		   if (state)
		   {
		   
		    word = word.toUpperCase();
		    password = password + word.charAt(word.length() - 2) + word.charAt(word.length() - 1);
		    state = false;
		    
		   } 

		   else 
		   {
		   
		    word = word.toLowerCase();
		    password = password + word.charAt(0) + word.charAt(1);
		    state = true;

		   }
		   
		 }
		 
	        }
	        
	        String password2 = "";
		for (int i = 0; i < password.length(); i++)
		{
	        switch(password.charAt(i))
	        {
	          case'H':
	           password2 += '#';
	           break;
	          case'I':
	           password2 += '!';
	           break;
	          case'a':
	           password2 += '@';
	           break;
	          case'b':
	           password2 += '6';
	           break;
	          default:
	           password2 += password.charAt(i);
	           break;
	        }
	     }

		return password2;
	}
}
