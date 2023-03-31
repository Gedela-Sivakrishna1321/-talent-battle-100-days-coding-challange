import java.util.Scanner;
public class Sivakrishna_Day28 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input : ");
	String str = sc.next();
	StringBuffer NewString = new StringBuffer();
	for(int i=str.length()-1;i>=0;i--) {
	NewString.append(str.charAt(i));
	}
	System.out.println(NewString);
	sc.close();
	}
}
