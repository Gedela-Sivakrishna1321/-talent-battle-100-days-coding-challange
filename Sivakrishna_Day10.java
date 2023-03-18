import java.util.Scanner;
public class Sivakrishna_Day10 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	long fact = 1;
	for(int i=1;i<=num;i++) {
	fact *= i;
	}
	System.out.println("Factorial of "+num+" = "+fact);
    sc.close();
	}
}
