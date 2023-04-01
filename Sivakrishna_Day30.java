import java.util.Scanner;
public class Sivakrishna_Day30 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input : ");
	String str = sc.next();
    char ch[] = str.toCharArray();
    int count=0;
    for(char c : ch) {
        count++;
    }
    System.out.println(count);
	sc.close();
	}
}