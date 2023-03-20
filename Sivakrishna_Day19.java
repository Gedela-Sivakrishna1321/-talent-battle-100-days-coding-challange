import java.util.Scanner;
public class Sivakrishna_Day19 { 
    // Check if a number is Armstrong number or not
    // All the digits from 1 - 9 are Armstrong numbers
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	// Step 1 - > Find number of digits
	int temp = num,count=0;
	while(temp>0) {
	count++;
	temp/= 10;
	}
	temp = num;
	int sum=0;
	// Step 2 - > Find the power of each digit and add
	for(int i=1;i<=count;i++) {
	sum += Math.pow(temp%10,count);
	temp /= 10;
	}
	// Checking ArmStrong condition
	if(sum == num) {
		System.out.println("Armstrong number");
	} else {
		System.out.println("Not Armstrong number");
	}
	sc.close();
	}
}

	
