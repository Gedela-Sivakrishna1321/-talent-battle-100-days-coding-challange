import java.util.Scanner;
public class Sivakrishna_Day14 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
    int rev=0,temp=num;
    // Logic
    while(num>0) {
        rev = rev*10 + num%10;
        num/=10;
    }
	System.out.println("Reverse of "+temp+" = "+rev);
    sc.close();
	}
}
	
