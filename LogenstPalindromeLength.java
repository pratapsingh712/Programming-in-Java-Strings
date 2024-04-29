import java.util.HashSet;
import java.util.Scanner;

public class LogenstPalindromeLength {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string of your choice to check the longest palindrome possible :");
		String str = sc.next();
		
		int len = longestPalindromeLength(str);
		
		System.out.println("Length of longest palindrome possible is = "+len);
		
		sc.close();
		
	}

	public static int longestPalindromeLength(String str) {
		
		int len = 0;
		
		HashSet<Character> hset = new HashSet<>();
		
		for(int index = 0; index < str.length(); index++)
		{
			char character = str.charAt(index);
			
			if(hset.contains(character))
			{
				len += 2;
				hset.remove(character);
			}
			
			else
			{
				hset.add(character);
			}
		}
		
		if(hset.size()>0) // meaning any remaining char that can not make any pair like ef won't make a palindrome together but 
			// could be used individually to create a palindrome
		{
			len++;
		}
		
		return len;
	}
}
