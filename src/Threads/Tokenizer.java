package Threads;

import java.util.StringTokenizer;

public class Tokenizer {
public static void main(String[] args) {
		
		String a= " : ";
		String b= " Venkat : isit : You";
		
		StringTokenizer c = new StringTokenizer(b, a);
		
		int count = c.countTokens();
		
		for (int i = 0; i<count; i++)
			
	  System.out.println("token [" + i + "] : "+ c.nextToken());
		StringTokenizer d= null;
		
		while (c.hasMoreTokens())
			System.out.println(d.nextToken());

	}
}
