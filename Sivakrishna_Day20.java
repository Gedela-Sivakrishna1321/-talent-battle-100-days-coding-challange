import java.util.Scanner;
public class Sivakrishna_Day20 {
    // Prime Number Program
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	if(num <= 0 ) {
	System.out.println("Enter valid number ");
	}else if (num == 1) {
	System.out.println("Neither prime nor composite"); 
	 }
	else {
	boolean isprime = true;
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num%i ==0) 	
		   isprime = false;
	}
	if(isprime) 
		System.out.println("Prime Number");
	else 
		System.out.println("Not prime Number");
	}
    sc.close();
	}
}
