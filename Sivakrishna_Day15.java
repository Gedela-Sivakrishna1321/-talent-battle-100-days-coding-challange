import java.util.Scanner;
public class Sivakrishna_Day15 {

	// Factorial function
	static long fact(int val ) {
	long fact =1;
	for(int i=1;i<=val;i++) {
	fact *= i;
	}
	return fact;
	}
	

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	// logic 
	int temp = num;
	long sum = 0;
	while(temp>0) {
	int curr_digit = temp%10;
	sum += fact(curr_digit);
	temp /= 10;
	}
	// checking
	if (sum == num ) {
	System.out.print("Strong number");
	}
	else {
	System.out.println("Not strong number");
	}
    sc.close();
	}
}