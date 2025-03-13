package string_Reversal;

import java.util.Scanner;

public class Reverse_a_String 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.next();
		for(int i=st.length()-1;i>=0;i--)
		{
			char ch = st.charAt(i);
			System.out.print(ch+" ");
		}
	}
}
