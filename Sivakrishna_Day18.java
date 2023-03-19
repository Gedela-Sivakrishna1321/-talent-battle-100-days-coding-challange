import java.util.Scanner;
public class Sivakrishna_Day18 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Fraction 1 : ");
	int n1 = sc.nextInt();
	int d1 = sc.nextInt();
	System.out.print("Enter the Fraction 2 : ");
	int n2 = sc.nextInt();
	int d2 = sc.nextInt();
	// Adding the fractions
	int n3 = (n1*d2)+(n2*d1);
	int d3 = (d1*d2);
	// simplification
	int max_divisor=0;
    int min = Math.min(n3,d3);
	for(int i=1;i<=min;i++) {
        if(n3%i ==0 && d3%i ==0){
            max_divisor = Math.max(max_divisor,i);
        }
    }
	// Printing the fraction
	int numerator = n3/max_divisor;
	int denominator = d3/max_divisor;
	System.out.println("Result = "+numerator+" \\ "+denominator);
   
    sc.close();
	}
}
	 