import java.util.ArrayList;
import java.util.Scanner;

public class LogestSubstingWithoutRepeatingCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string to check longest substring without any repeating character :");
		String str = sc.next();
		
		System.out.println("Longest substring length is = "+logestSubstring(str));
		
		sc.close();
		
	}
	
	public static int logestSubstring(String str)
	{
		ArrayList<Character> list = new ArrayList<>();
		
		
		
		int removingIndex = 0;
		int index = 0;
		int maxLen = 0;
		
		while(index<str.length()) // basically ek baar pakde gaya koi bhi repeating char index and removing index jab tak same 
			//nahi ho jate index tab tak wait krega  tak tak max length bhi mil chuka hoga or agar is point se naya ko nahi mile list
			// to purana len hi max hoga
		{
			if(!list.contains(str.charAt(index)))
			{
				list.add(str.charAt(index));
				index++;
			}
			
			else
			{
				list.remove(Character.valueOf(str.charAt(removingIndex)));// i am using .value of otherwise list.remove will take 
				// ascii vlaue of the string and throw index out of bound exception.
				removingIndex++;
			}
			
			maxLen = Math.max(maxLen, list.size());
		}
		
		//System.out.println(list); this is not accurate for all string also if just do list.remove(0) without removing index 
		// that would still work
		return maxLen;
	}
}
