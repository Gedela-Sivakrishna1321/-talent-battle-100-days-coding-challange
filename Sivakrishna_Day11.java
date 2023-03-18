import java.util.Scanner;
public class Sivakrishna_Day11 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of terms : ");
	int terms = sc.nextInt();
	int t1,t2,t3;
	t1 =0;t2=1;
	System.out.print(t1+"\t"+t2+"\t"); // Prints zero and one
	while((terms-2)>0) {
	t3 = t1 + t2;
	System.out.print(t3+"\t");
	t1 = t2;
	t2 = t3;
	terms--;
	
	}
	sc.close();
	}
}