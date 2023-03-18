import java.util.Scanner;
public class Sivakrishna_Day8 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the coefficients : " );
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	double d = Math.sqrt(b*b - (4*a*c));
	double first_root = (-b + d )/2*a ;
	double second_root = (-b -d)/2*a ;
	System.out.println("First root = "+first_root);
	System.out.println("Second root = "+second_root);
    sc.close();
	}
}