import java.util.Scanner;
public class Sivakrishna_Day34 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input : ");
	String str = sc.next();
	StringBuffer Newstr = new StringBuffer();
	for(int i=0;i<str.length();i++) {
	char ch = str.charAt(i);
	if(!(ch == '(' || ch == ')')) {
	Newstr.append(ch);
	}
	}
	System.out.println(Newstr);
	sc.close();
	}
}
