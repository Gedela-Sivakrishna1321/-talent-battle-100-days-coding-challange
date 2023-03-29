import java.util.Scanner;
public class Sivakrishna_Day26 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input = ");
	int num_people = sc.nextInt();
	// Sum of first n-1 terms = (n-1)*n/2;
	int No_handshakes = ((num_people-1)*num_people)/2; 
	System.out.println(No_handshakes);
	sc.close();
	}
}