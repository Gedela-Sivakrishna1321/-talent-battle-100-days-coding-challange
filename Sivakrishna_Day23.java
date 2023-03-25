import java.util.Scanner;
public class Sivakrishna_Day23 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	StringBuilder str_New = new StringBuilder("");
	for(int i=0;i<str.length();i++) {
	// Logic
	if(str.charAt(i) != '0') 
		str_New.append(str.charAt(i));
	else 
		str_New.append("1");
	}
	System.out.println(str_New);
	sc.close();
	}
}