package classwork;

import java.util.Scanner;

public class PalindromeTest
{
	public static void main(String[] args)
	{
      
		Scanner scanner = new Scanner(System.in);
		StackComposition<Character> stack = new StackComposition<>();
		Queue<Character> queue = new Queue<>();

		// get text from standard input
      		System.out.println("Please enter a line:");
      		String text = scanner.nextLine();

		int i = 0;
		char ch;
		
		//place each character of the text (in uppercase) in a stack and a queue.
		while (i < text.length())
		{
			ch = text.charAt(i);
			stack.push(Character.toUpperCase(ch));
			queue.enqueue(Character.toUpperCase(ch));
			i++;
		}

		//print the current stack and queue contents
		stack.print();
		queue.print();

		boolean isPalindrome = true;

		//loop checks the corresponding characters for plaindrome
		while (!queue.isEmpty())
   		{
    		    if (stack.pop() != queue.dequeue())
     		    {
      			     isPalindrome = false;
       			     break;
      		    }
       		    
   	        }

   		//print whether palindrome or not
		if (isPalindrome)
       			System.out.println("The line of text you entered is a palindrome");
    			else
       			System.out.println("The line of text you entered is not a palindrome");

    			

	}

}
