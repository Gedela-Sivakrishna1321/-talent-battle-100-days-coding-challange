import java.util.Scanner;
public class Sivakrishna_Day16 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	for(int j=1;j<=3;j++){
    System.out.print("Enter a number :");
    int num = sc.nextInt();
	int sum=0;
	// Logic
	for(int i=1;i<=num/2;i++) {
	if(num%i == 0) 
		sum += i;
	
	}
	if(num == sum) {
	System.out.println("Perfect number");
	} else {
	System.out.println("Not a perfect number");
	}
}
    sc.close();
    }
}