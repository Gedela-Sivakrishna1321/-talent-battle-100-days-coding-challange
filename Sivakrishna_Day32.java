import java.util.Scanner;
public class Sivakrishna_Day32 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input : ");
	String str = sc.next(); 
    StringBuilder NewStr = new StringBuilder(" ");
	for(int i=0;i<str.length();i++) {
	char ch = str.charAt(i);
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
	
	} else {
        NewStr.append(ch);
    }         	
	}	
    System.out.println(NewStr);
    sc.close();
	}

}  


