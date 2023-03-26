import java.util.Scanner;
public class Sivakrishna_Day24 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	// Logic
	for(int i=1;i<=num;i++ ) {
	// Space
	for(int j=num;j>i;j--) {
	System.out.print(" ");
	}
	
	// Print Star
	for(int k=1;k<=i;k++) {
	System.out.print("* ");
	}
    System.out.println();
	}
	sc.close();
	}
}