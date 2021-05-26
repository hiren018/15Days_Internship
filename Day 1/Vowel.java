import java.util.*;


public class Vowel {
	public static void main(String s[]) {
		Scanner s5 = new Scanner(System.in);
		System.out.println("Enter any character:");
		char ch = s5.next().charAt(0);
		
		if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' )
			{
				System.out.println("enterd character is vowel");
			}
		else
			{
			System.out.println("enterd character is constant");
			}
	
	}
	

}
