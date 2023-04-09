import java.util.Scanner;
public class Sivakrishna_Day38 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input : ");
	String str = sc.next();
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		int count=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j) == ch) {
				count++;
			}
		}
		if(count < 2) {		
			System.out.print(ch + " ");
		}
	}
    sc.close();

}
}