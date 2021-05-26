import java.util.*;
public class Gcd {
	public static void main(String s[]) {
		Scanner s9 = new Scanner(System.in);
		System.out.println("enter two no.");
		int x = s9.nextInt();
		int y = s9.nextInt();
		int a=x,b=y,r;
		while(b != 0) {
			r = a%b;
			a=b;
			b=r;
		}
System.out.println("gcd of " + x + " and " + y + " is: " + a);
		}

	}
