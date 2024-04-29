import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string to check if it's a palindrome or not :");
		String str = sc.next();
		
		//String str1 = "mom";
		
		//System.out.println(str1.substring(1, 2));
		
		if(isPalindrome(str))
		{
			System.out.println("given string is a palindrome :");
		}
		else
		{
			System.out.println("given string is not a palindrome :");
		}
		
		sc.close();
	}
	
	public static boolean isPalindrome(String str)
	{
		System.out.println(str);
		if(str.length()<=1) // basecase if a string is left with or had only 1 or 0 string then it's a palindrome 
		{
			return true;
		}
		// example string mommom
		
		char firstChar = str.charAt(0); // m
		char lastChar = str.charAt(str.length()-1);//m
		
		if(firstChar==lastChar) // true
		{
			
			return isPalindrome(str.substring(1, str.length()-1)); 
			// i am calling the function itself for the substring
			//first substring will be ommo
		}
		else
		{
			return false;
		}
	}
}
