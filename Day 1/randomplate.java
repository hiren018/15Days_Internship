import java.util.Random;

public class randomplate {
	public static void main(String s[]) {
		int i,j;
		System.out.print("NumberPlate : ");
		Random a= new Random();
		j = a.nextInt(10000);
		String str = "qwertyuioplkjhgfdsazxcvbnm";
		Random a1= new Random();
		for(i=0;i<3;i++) {
		char c = str.charAt(a1.nextInt(str.length()));
		System.out.print(c);
		
		}
		System.out.print("-" + j);
	}

}
