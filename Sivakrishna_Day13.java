import java.util.Scanner;
public class Sivakrishna_Day13 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	System.out.println("Sum of first "+num+" natural numbers = "+ num * (num + 1) /2);
    sc.close();
	}
}
	