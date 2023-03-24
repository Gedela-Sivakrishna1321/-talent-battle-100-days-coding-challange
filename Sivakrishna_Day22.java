import java.util.Scanner;
public class Sivakrishna_Day22 { // Program to express a number as sum of 2 prime numbers

	// Prime Number Logic
	static boolean isprime(int num) {
	if(num == 1)
		return false;
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num%i ==0) 
			return false;
	}
	return true;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	
	if(num>3) {
        int flag = 0;
		for(int i=1;i<num;i++) {
		// Logic
		if(isprime(i) && isprime(num-i)) {
			System.out.println(num+" can be expressed as sum of "+i+ " and "+(num-i));
			flag =1;
            break;
		}
         }
         if(flag == 0)
            System.out.println(num + " can't be expressed as sum of two primes");
		
	} else {
		System.out.println("Invalid Entry ");
	}
    sc.close();
	}
}
