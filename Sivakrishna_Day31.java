import java.util.Scanner;
public class Sivakrishna_Day31 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input : ");
	String str = sc.next();
	System.out.println(work.toggle(str));
    sc.close();
	}
}

class work {
	public static String toggle(String str) {
	StringBuilder NewString = new StringBuilder();
	for(int i=0;i<str.length();i++) {
	char curr = str.charAt(i);
	if((curr>=65) && (curr<=90)) {
	curr = Character.toLowerCase(curr);
	NewString.append(curr);
	} else {
	curr = Character.toUpperCase(curr);
	NewString.append(curr);
	}
	}
	return NewString.toString();
	}	
}
