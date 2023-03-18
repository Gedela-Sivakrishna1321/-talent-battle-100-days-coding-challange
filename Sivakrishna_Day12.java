import java.util.Scanner;
public class Sivakrishna_Day12 {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	long num = sc.nextLong();
	int sum=0;
	// logic
	while(num > 0) {
	sum += num%10;
	num /= 10;
	}
	System.out.println("The sum of digits = "+sum);
    sc.close();
	}
}
